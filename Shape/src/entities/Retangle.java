package entities;

import entities.enums.Color;

public class Retangle extends Shape {

	private double width, height;

	public Retangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (this.width * this.height);
	}
	
}
