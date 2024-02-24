package com.edubridge.assessment.abstraction;

public class Motercycle extends Vehicle{

	@Override
	void startEngine() {
		System.out.println("Moter Cycle Engine is started");
		
	}

	@Override
	void stopEngine() {
		System.out.println("Moter Cycle Engine is Stopped");		
	}

}
