package test;
import java.util.Scanner;

class Customer{
	Scanner sc= new Scanner(System.in);
	int accountNumber,balance;
	String accountType,customerName;
	public void setCustomerDetails() {
		System.out.println("Enter Account Number");
		accountNumber=sc.nextInt();
		System.out.println("Enter Account Type");
		accountType=sc.next();
		System.out.println("Enter Name");
		customerName =sc.next();
		System.out.println("Enter Balance ");
		balance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("Account Number"+this.accountNumber);
		System.out.println("Account Type"+this.accountType);
		System.out.println("Account Number"+this.accountNumber);
		System.out.println("Account Number"+this.accountNumber);
	}
	
}
public class BankAppUsingException {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int lim;
		System.out.println("How many number of customers do you want to input?");
		lim=sc.nextInt();
		Customer[]  customer =new Customer[lim];
		for(int i=0;i<lim;i++) {
			customer[i].setCustomerDetails();
		}
	}
}
