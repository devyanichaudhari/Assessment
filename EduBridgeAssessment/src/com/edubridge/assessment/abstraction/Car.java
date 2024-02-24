package com.edubridge.assessment.abstraction;

public class Car extends Vehicle
{

	@Override
	void startEngine() {
		System.out.println("Car Engine is started");
		
	}

	@Override
	void stopEngine() {
		System.out.println("Car Engine is stopped");
		
	}

}
