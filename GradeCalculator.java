/*
 * File : GradeCalculator
 * Description : Find Grade
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :25/09/2023
 */

package test;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
		int percentage ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Percentage");
		percentage=sc.nextInt();
		if(percentage>90) {
			System.out.println("Grade is S");
		}
		else if(percentage>85&&percentage<=90) {
			System.out.println("Grade is A+");
		}
		else if(percentage>80&&percentage<=85) {
			System.out.println("Grade is A");
		}
		else if(percentage>75&&percentage<=80) {
			System.out.println("Grade is B+");
		}
		else if(percentage>70&&percentage<=75) {
			System.out.println("Grade is B");
		}
		else if(percentage>60&&percentage<=70) {
			System.out.println("Grade is C");
		}
		else if(percentage>50&&percentage<=60) {
			System.out.println("Grade is D");
		}
		else if(percentage>=40&&percentage<=50) {
			System.out.println("Grade is E");
		}
		else if(percentage<40) {
			System.out.println("Grade is F");
		}
		
	}
}
