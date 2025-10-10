package API_Tests;

import static org.hamcrest.Matchers.lessThanOrEqualTo;


import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecificationTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
	@BeforeClass
	public void setUp() {
		//create the request specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io/v2/pet").
//				setContentType(ContentType.JSON).
				addHeader("Content-Type","application/json").
				build();
		//creat the response specification
		
		responseSpec = new ResponseSpecBuilder().
				expectStatusCode(200).
				expectBody("status", equalTo("alive")).
				expectResponseTime(lessThanOrEqualTo(5000L)).//2000 to 3000 milli sec is avg .. its not constant
				build();
	}
	
		@Test(priority = 1)
		public void postRequestTest() {
			Map<String, Object> reqBody = new HashMap<>();
			reqBody.put("id", 77232);
			reqBody.put("name", "Riley");
			reqBody.put("status", "alive");
			//Send request and save the response
			Response response = given().spec(requestSpec).body(reqBody).when().post();
			//extract pet id from response 
			this.petId = response.then().extract().path("id");
			//assertions
			response.then().spec(responseSpec);
		}
		
		@Test(priority = 2)
		public void getRequestTest() {
			//send request get response 
			given().spec(requestSpec).pathParam("petId", this.petId).
			when().get("/{petId").
			then().spec(responseSpec).body("name", equalTo("Riley"));
			
		}
		
		@Test(priority = 3)
		public void deleteRequestTest() {
			//send request , get response 
			given().spec(requestSpec).pathParam("petId", this.petId).
			when().delete("/{petId}").
			then().statusCode(200);
		}
}
