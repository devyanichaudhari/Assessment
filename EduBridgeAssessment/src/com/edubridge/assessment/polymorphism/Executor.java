package com.edubridge.assessment.polymorphism;

public class Executor {

	public static void main(String[] args) {
		Rugby r = new Rugby();
		r.play("Tenis", 10);
		Basketball b = new Basketball();
		b.play("Cricket",11);
	}
}
