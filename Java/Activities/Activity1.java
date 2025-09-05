package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car Hyundai = new car();
		
		Hyundai.make = 2018;
		Hyundai.color = "white";
		Hyundai.transmission = "Hybrid";
		Hyundai.accelerate();
		Hyundai.brake();
		Hyundai.displayCharacteristics();
	}

}
