/*
 * File : StringComparison
 * Description : Java program to compare two string 
 * Author : Stephin Mathew 
 * Version : 1.0
 * Date :27/11/2023
 */

package test;
import java.util.Scanner;
public class StringComparison {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String str1=sc.next();
		System.out.println("Enter string 2 :");
		String str2=sc.next();
		int result = str1.compareToIgnoreCase(str2);
		if(result==0) {
			System.out.println("Both strings are same ");
		}
		else if(result<0) {
			System.out.println("String 2 is greater than string1");
		}
		else {
			System.out.println("String 1 is greater than String 2");
		}
	}

}
