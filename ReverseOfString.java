/*
 * File : ReverseOfString
 * Description : Reversing of a string
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :31/10/2023
 */

package test;
import java.util.Scanner;
public class ReverseOfString {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  String word;
	  System.out.println("Enter String");
	  word=sc.next();
	  int length=word.length();
	  char ar1[]=word.toCharArray();
	  char ar2[]= new char[length];
	  System.out.println("Reversed string is : ");
	  for(int i=0;(i<length);i++) {
		ar2[i]=ar1[length-i-1];
	    System.out.print(ar2[i]);
   }
  }
}
