package activities;

 class car {

		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		public car() {
			tyres = 4;
			doors = 4;
			
		}
		
	public void displayCharacteristics() {
		System.out.println("Color of the car " + color);
		System.out.println("when it is transmissted " + transmission);
		System.out.println("Car made on " + make);
		System.out.println("Number of tyres in car " + tyres);
		System.out.println("Number of doors in car " + doors);
		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward.");	
	}
	
	public void brake() {
		System.out.println("Car has stopped.");	
	}
	//brake() - This prints "Car has stopped."
}

