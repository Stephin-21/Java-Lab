/*
 * File : SumOfPositiveNumbers
 * Description : Finding Sum Of Positive Numbers
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :25/09/2023
 */


package test;
import java.util.Scanner;
public class SumOfPositiveNumbers {
	public static void main(String[] args) {
		int inputNumber,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		inputNumber=sc.nextInt();
		while(inputNumber>0) {
			sum=sum+inputNumber;
			System.out.println("Enter Next Number : ");
			inputNumber=sc.nextInt();
		}
		System.out.println("Sum is "+sum);
	}

}
