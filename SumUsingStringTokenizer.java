/*
 * File : SumUsingStringTokenizer
 * Description : Calculating sum using String Tokenizer
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :28/11/2023
 */

package test;
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumUsingStringTokenizer {
	public static void main(String[] args) {
		int sum=0,num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		String input=sc.nextLine();
		StringTokenizer obj=new StringTokenizer(input);
		
		int noOfTokens=obj.countTokens();
		System.out.println("Inputed Numbers are : ");
		while(obj.hasMoreTokens()) {
			 num=Integer.parseInt(obj.nextToken());
			 System.out.println(num);
			 sum=sum+num;
		}
		System.out.println("Sum of "+noOfTokens+" Tokens is : "+sum);
		}

	}

