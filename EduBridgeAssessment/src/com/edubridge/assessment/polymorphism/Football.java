package com.edubridge.assessment.polymorphism;

public class Football extends Sports
{
	public void play(String sportName,int numberOfPlayer)
	{
		super.play("FootBall", numberOfPlayer);
		System.out.println("Sports Name: "+sportName+"\nNumber of Players: "+numberOfPlayer);
	}

}
