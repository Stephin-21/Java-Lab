/*
 * File : SynchronizationDemo
 * Description : Thread Sychronization during Multiplication Table creation
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :29/11/2023
 */


package test;
import java.util.Scanner;

class MultiplicationTable{
	synchronized void printMultiplicationTable(int number) {
		//synchronized(this) {
		  for(int i=1;i<=10;i++) {
			 System.out.println(i+"X"+number+"="+i*number);
		 }
	 //}
  }
}


class MyThread1 extends Thread{
	MultiplicationTable t ;
	MyThread1(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(5);
	}
}


class MyThread2 extends Thread{
	MultiplicationTable t ;
	MyThread2(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(7);
	}
}


public class SynchronizationDemo {
	public static void main(String[] args) {
		MultiplicationTable m= new MultiplicationTable();
		MyThread1 t= new MyThread1(m);
		
		MyThread2 t2 =new MyThread2(m);
		t2.setPriority(2);
		
		t2.start();
		t.start();
		
		
	}

}





