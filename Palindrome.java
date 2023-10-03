package test;
import java.util.Scanner;
public class Palindrome {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string : ");
	 String input = sc.next();
	 boolean isPalindrome =check(input);
	 if(isPalindrome) {
		 System.out.println("The Given string is Palindrome");
	 }
	 else {
		 System.out.println("The Given string is not Palindrome");
	 }
 }
 
	static boolean check(String input) {
		 char[] charArray=input.toCharArray();
		 int length =input.length();
		for(int i=0;i<=length/2;i++) {
			if(charArray[i]!=charArray[length-i-1]) {
				return false ;
			}
		}
		return true;
	 }
}
 

