/*
 * File : SumUsingDoWhile
 * Description : Finding Sum Of Positive Numbers Using Do While Loop
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :25/09/2023
 */


package test;
import java.util.Scanner;
public class SumUsingDoWhile {
	public static void main(String[] args) {
		int inputNumber=0,sum=0;
		Scanner sc=new Scanner(System.in);
		do{
			sum=sum+inputNumber;
			System.out.println("Enter  Number : ");
			inputNumber=sc.nextInt();
		}while(inputNumber>0) ;
		System.out.println("Sum is "+sum);
	}
}
