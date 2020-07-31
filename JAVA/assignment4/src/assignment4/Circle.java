package assignment4;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this.color="red";
		this.radius=1.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color) {
		this.color=color;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
