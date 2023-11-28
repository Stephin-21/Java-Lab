/*
 * File : FileHandling
 * Description : Thread Sychronization during Multiplication Table creation
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :28/11/2023
 */

package test;
import java.util.Scanner;

class myThread extends Thread{
	int number;
	myThread(int number){
		this.number=number;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(number+"*"+i+" = "+number*i);
		}
	}
}

public class ThreadSyncExercise {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num,num1,num2;
		
		System.out.println("Enter the table you want to run by thread1");
		num=sc.nextInt();
		myThread obj=new myThread(num);
		
		System.out.println("Enter the table you want to run by thread2");
		num1=sc.nextInt();
		myThread obj2=new myThread(num1);
	
		System.out.println("Enter the table you want to run by thread3");
		num2=sc.nextInt();
		myThread obj3=new myThread(num2);
		obj.start();
		obj2.start();
		obj3.start();
		
	}
	
}
