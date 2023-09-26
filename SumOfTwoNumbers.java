/*
 * File : SumOfTwoNumbers
 * 
 */


package test;
import java.util.Scanner ;
public class SumOfTwoNumbers {
public static void main(String[] args) {
	int numberOne ,numberTwo,Sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two numbers:");
	numberOne = sc.nextInt();
	numberTwo = sc.nextInt();
	Sum=numberOne+numberTwo ; 
    System.out.println("Sum of two numbers is :"+Sum);
}
}
