package com.javaLambda;

interface Shape{
	void draw();
}

public class LambdaExample {
	public static void main(String[] args) {
		
	Shape rectangle = () -> System.out.println("Rectangle class: draw() method");
//	rectangle.draw();
//	
	
	Shape circle = () -> System.out.println("Circle class: draw() method");
//	circle.draw();
	
	
	Shape square =  () -> System.out.println("Square class: draw() method"); 
//	square.draw();
//	
	print(rectangle);
	print(circle);
	print(square);
		
	
}
	private static void print(Shape shape) {
		shape.draw();
	}
}
