package com.aurionpro.main;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.ColorType;
import com.aurionpro.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle circles[] = {
				new Circle(-2, ColorType.BLUE, BorderType.DASHED),
				new Circle(200, ColorType.GREEN),
				new Circle(20),
				new Circle(),
				new Circle(30, ColorType.RED, BorderType.DOTTED),
				};
		
		for(Circle c : circles)
			printObjectDetail(c);
	}

	public static void printObjectDetail(Circle circle) {
		System.out.println("Circle Radius is : " + circle.getRadius());
		System.out.println("Circle Color is : " + circle.getColor());
		System.out.println("Circle Border is : " + circle.getBorder());
		System.out.println("Area of Big Rectangle is : " + circle.calculateArea());
		System.out.println("\n***************************************************\n");
	}

}
