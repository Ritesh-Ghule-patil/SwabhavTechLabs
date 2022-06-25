package com.aurionpro.model;

public class Circle {
	private final double PI = 3.14;
	private final double radius;
	private final BorderType border;
	private final ColorType color;
	
	public Circle(double radius, ColorType color, BorderType border) {
		this.radius = validateRadius(radius);
		this.color = color;
		this.border = border;
	}
	public Circle(double radius, ColorType color) {
		this(radius, color, BorderType.SOLID);
	}
	public Circle(double radius) {
		this(radius , ColorType.RED , BorderType.SOLID);
	}
	public Circle() {
		this(10, ColorType.RED , BorderType.SOLID);
	}

	public double getPI() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	public BorderType getBorder() {
		return border;
	}

	public ColorType getColor() {
		return color;
	}

	public double calculateArea() {
		return PI*(radius*radius);
	}
	
	private static double validateRadius(double radius) {
		if(radius<=0) {
			return 1;
		}
		if(radius>25) {
			return 25;
		}
		return radius;
	}

}
