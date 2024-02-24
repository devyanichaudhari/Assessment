package com.edubridge.assignment;
public class Area extends Shape {

	@Override
	void RectangleArea(int length, int breadth) {
		int area = length * breadth;
		System.out.println(area);
		
	}

	@Override
	void SquareArea(int side) {
		int area = side*side;
		System.out.println(area);
		
	}

	@Override
	void CircleArea(int radius) {
		double area = 3.14*radius*radius;
		System.out.println(area);		
	}

}
