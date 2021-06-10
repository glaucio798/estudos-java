package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape(Color color) {
		this.setColor(color);
	}
	
	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
	
}
