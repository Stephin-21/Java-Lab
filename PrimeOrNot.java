/*
 * File : PrimeOrNot
 * Description : Check Wheather a inputed number is Prime Or not 
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :31/10/2023
 */

package test;
import java.util.Scanner;
public class PrimeOrNot {
 public static void main(String [] args) {
	 int num,i,count=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number : ");
	 num=sc.nextInt();
	 for(i=2;i<num;i++) {
		 if(num%i==0) {
			 count++;
		 }
	 }
	 if(count>0) {
		 System.out.println(num+ " is not Prime ");
	 }
	 else {
		 System.out.println(num+" is Prime ");
	 }
 }
}
