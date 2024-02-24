package com.edubridge.assignment;

import java.util.*;

class SortbyMovieRating implements Comparator<Movie>
{
	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.movierating-o2.movierating;
	}
}
class Sortbypublishyear implements Comparator<Movie>
{
	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.publishyear-o2.publishyear;
	}
}
public class MovieExecutor {

	public static void main(String[] args) {
		ArrayList<Movie> m1 = new ArrayList<Movie>();
		m1.add(new Movie("Dhoom",3,2013));
		m1.add(new Movie("ABCD",4,2015));
		m1.add(new Movie("ABCD2",3,2016));
		m1.add(new Movie("Jackpot",2,2012));
		System.out.println("Unsorted Data....");
		for(int i=0;i<m1.size();i++)
		{
			System.out.println(m1.get(i));
		}
		Collections.sort(m1,new SortbyMovieRating());
		System.out.println("Sorted Data by Movie Rating");
		for(int i=0;i<m1.size();i++)
		{
			System.out.println(m1.get(i));
		}
		
		Collections.sort(m1,new Sortbypublishyear());
		System.out.println("Sorted Data by Publish Yaer");
		for(int i=0;i<m1.size();i++)
		{
			System.out.println(m1.get(i));
		}
	}

}
