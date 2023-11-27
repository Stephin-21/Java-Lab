/*
 * File : CharFromString
 * Description : Java program extract charachter from string
 * Author : Stephin Mathew 
 * Version : 1.0
 * Date :27/11/2023
 */

package test;
import  java.util.Scanner;
public class CharFromString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String ");
		String sent=sc.next();
		System.out.println("Enter Index : ");
		int index=sc.nextInt();
		System.out.println(sent.charAt(index));
	}

}
