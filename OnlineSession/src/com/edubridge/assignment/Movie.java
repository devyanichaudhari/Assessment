package com.edubridge.assignment;


public class Movie{
	String moviename;
	int movierating;
	int publishyear;
	
	
	public Movie(String moviename, int movierating, int publishyear) {
		super();
		this.moviename = moviename;
		this.movierating = movierating;
		this.publishyear = publishyear;
	}


	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", movierating=" + movierating + ", publishyear=" + publishyear + "]";
	}
}
