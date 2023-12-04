/*
 * File : ExceptionHandling
 * Description : Java program that shows the usage of try, catch and finally
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :10/11/2023
 */

package test;

import java.util.Scanner;

public class ExceptoionHandling2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char choice='y';
		while(choice=='y') {
		System.out.println("Enter Number 1 : ");
		num1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		num2=sc.nextInt();
		
		int result;
		try {
			result=num1/num2;
			System.out.println("Result = "+result);
			}
			catch(Exception e){
			System.out.println("/ by zero");
		}
		finally {
			System.out.println("End Of Operation");
			System.out.println("Do you want to continue y or n ");
			choice=sc.next().charAt(0);
			
		}
		
		}
	}
}

