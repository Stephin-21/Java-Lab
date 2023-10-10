/*
 * File : AreaCalculator
 * Description : Calculating area using Method Overloading
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :10/10/2023
 */


package test;
import java.util.Scanner;
public class AreaCalculator {
public static void main(String [] args) {
float base,height,radius;
int width,Height;
Scanner sc= new Scanner(System.in);
Area area =new Area();

System.out.println("Enter The base of the Triangle : ");
base=sc.nextFloat();
System.out.println("Enter The Height of the Triangle : ");
height=sc.nextFloat();

System.out.println("Enter The Width of the Rectangle : ");
width=sc.nextInt();
System.out.println("Enter The Height of the Rectangle : ");
Height=sc.nextInt();


System.out.println("Enter The Radius of the Circle : ");
radius=sc.nextFloat();
area.getArea(width, Height);
area.getArea(base,height);
area.getArea(radius);

}
}
class Area{
public void getArea(float base,float height) {
	System.out.println("Area of Triangle with base "+base+ " and height "+height+ " is : "+ 0.5*base*height);
}

public void getArea(int width,int Height) {
		System.out.println("Area of Rectangle with width "+width+ " and length "+Height + " is : " +width*Height);
	}
public void getArea(float radius) {
		System.out.println("Area of Circle with radius "+radius+ " is : "+3.14*radius*radius);
}
}
