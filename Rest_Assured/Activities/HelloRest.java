package API_Tests;


import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.http.ContentType;

public class HelloRest {
	
	@Test
	public void HelloRest() {
		String baseURI = "https://petstore.swagger.io/v2/pet";
		
		Response response =
				given().contentType(ContentType.JSON)
				.when().get(baseURI + "/findByStatus?status=sold");
			response.prettyPrint();
		
		//Assertions
		response.then().statusCode(200);
		response.then().body("[0].status", equalTo("sold"));
		
	}


}
