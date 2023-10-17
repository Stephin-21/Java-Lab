/*
 * File : EmployeeDetails
 * Description : Storing details of employees with the help of inheritance 
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :17/10/2023
 */

package test;
import java.util.Scanner;
public class employeeData {
	public static void main(String [] args) {
	Officer officer=new Officer();
	System.out.println("Enter details of Officer  ");
	officer.getDetails();
	officer.getSpecialization();
	officer.printDetails();
	officer.printSpecialization();

	Manager manager =new Manager();
	System.out.println("Enter details of Manager  ");
	manager.getDetails();
	manager.getDepartment();
	manager.printDetails();
	manager.printDepartment();
	}
}

// Employee Class
class Employee{
	String name;
	int age;
	long phoneNumber;
	String address;
	float salary;
	Scanner sc = new Scanner(System.in);
	//Method to Input Basic Details
	public void getDetails() {
		System.out.println("Enter name : ");
		this.name=sc.nextLine();
		System.out.println("Enter Address : ");
		sc.nextLine();
		this.address=sc.nextLine();
		System.out.println("Enter age : ");
		this.age=sc.nextInt();
		System.out.println("Enter Phone Number : ");
		this.phoneNumber=sc.nextLong();
		System.out.println("Enter Salary : ");
		this.salary=sc.nextFloat();
	}
	// Method to Print Details
	public void printDetails() {
		System.out.println("Name :" +this.name+ ", Age : "+this.age+", Phone Number : "+this.phoneNumber+", Address : "+this.address+", Salary : "+this.salary);
	}
	// Method to Print Salary
	public void printSalary() {
		System.out.println("Salary of "+this.name+"is : "+this.salary);
	}
}

// Officer Class
class Officer extends Employee{
	String specialization;
	// Method to input Specialization
	public void getSpecialization() {
		System.out.println("Enter Specialization : ");
		this.specialization=sc.next();
	}
	// Method to Print Specialization
	public void printSpecialization() {
		System.out.println(this.name+" is specialized in  "+this.specialization);
		
	}
}
//Manager Class
class Manager extends Employee{
	String department;
	// Method to input Department
	public void getDepartment() {
		System.out.println("Enter Department : ");
		this.department=sc.next();
	}
	// Method to print Department
	public void printDepartment() {
		System.out.println(this.name+" is  in  "+this.department +" Department ");
		
	}
	
}
