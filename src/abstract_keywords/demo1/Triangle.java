﻿package abstract_keywords.demo1;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;

	public void setSide(double a, double b, double c) {
		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("三角形三边值和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(String color, double a, double b, double c) {
		super(color);
		this.setSide(a, b, c);
	}

	@Override
	public double calPerimeter() {
		return a + b + c;
	}

	@Override
	public String getType() {
		return "三角形";
	}
}
