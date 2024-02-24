package com.edubridge.assessment.abstraction;

public class VehicleExecutor {

	public static void main(String[] args) {
		Car c = new Car();
		Motercycle m = new Motercycle();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();
	}

}
