/*
 * File : Abstract Class 
 * Description : Java program to create an abstract class
 * Author : Stephin Mathew 
 * Version : 1.0
 * Date :27/10/2023
 */

package test;

public class AbstractClass {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
		
	}

}

abstract class Shape{
	abstract public void numberOfSides();
}

class Rectangle extends Shape{
	public void numberOfSides() {
		System.out.println("Number of sides of Rectangle is 4");
	}
}

class Triangle extends Shape{
	public void numberOfSides() {
		System.out.println("Number of sides of Trianle is 3");
	}
}

class Hexagon extends Shape{
	public void numberOfSides() {
		System.out.println("Number of sides of Hexagon is 6");
	}
}

