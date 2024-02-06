package com.edubridge.assessment.polymorphism;

public class Basketball extends Sports
{
	public void play(String sportName,int numberOfPlayer)
	{
		super.play("Basket Ball", 12);
		System.out.println("Sports Name: "+sportName+"\nNumber of Players: "+numberOfPlayer);
	}
}
