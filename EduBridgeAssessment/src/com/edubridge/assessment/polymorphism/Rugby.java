package com.edubridge.assessment.polymorphism;

public class Rugby extends Sports
{
	public void play(String sportName,int numberOfPlayer)
	{
		super.play("Rugby", 13);
		System.out.println("Sports Name: "+sportName+"\nNumber of Players: "+numberOfPlayer);
	}
}
