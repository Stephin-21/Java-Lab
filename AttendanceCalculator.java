/*
 * File : AttendanceCalculator
 * Description : Find Attendance 
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :25/09/2023
 */



package test;
import java.util.Scanner;
public class AttendanceCalculator {
 public static void main(String[] args) {
	 int attendance;
	 float mark;
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Attendance percentage");
	 attendance=sc.nextInt();
	 if(attendance>90) {
		 mark=10f;
		 System.out.println("Mark is "+mark);
	 }
	 else {
		 mark=(float)attendance/10;
		 System.out.println("Mark is "+mark);
	 }
 }
}