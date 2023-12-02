/*
 * File : MultiThreading
 * Description : Write a Java program that implements a multi-threaded program which has three threads. First thread generates 
 * a random integer every 1 second. If the value is even, second thread computes the square of the number and prints. If the 
 * value is odd the third thread will print the value of cube of the number
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :2/12/2023
 */

package test;
import java.util.Random;
class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated=false;
	public  synchronized void generateNumber() {
		generatedNumber= new Random().nextInt(99)+2;
		System.out.println("Generated Number is : "+generatedNumber);
		numberGenerated=true;
		notifyAll();
		
	}
   public synchronized void oddNumber() throws InterruptedException {
	   while(!numberGenerated || generatedNumber%2==0) {
		   wait();
	   }
	   
		    System.out.print("Cube of "+generatedNumber +" is "+generatedNumber*generatedNumber*generatedNumber+" ");
   
	   System.out.println();
	   numberGenerated=false;
	   
}
   
   public synchronized void evenNumber() throws InterruptedException {
	   while(!numberGenerated || generatedNumber%2!=0) {
		   wait();
	   }
	     System.out.print("Square of "+ generatedNumber +" is " +generatedNumber*generatedNumber+" ");
	   System.out.println();
	   numberGenerated=false;
	   
}
}

class numberGenerator extends Thread{
	NumberManager m =new NumberManager();
	numberGenerator(NumberManager m){
		this.m=m;
	}
	public void run() {
	while(true) {
        m.generateNumber();
 	try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
}

  class EvenPrinterThread extends Thread{
	  NumberManager m =new NumberManager();
	  EvenPrinterThread(NumberManager m){
			this.m=m;
		}
	  public void run() {
		  while(true) {
		  try {
			  m.evenNumber();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  }
  }
  }
  
  class OddPrinterThread extends Thread{
	  NumberManager m =new NumberManager();
	  OddPrinterThread(NumberManager m){
			this.m=m;
		}
	  public void run() {
		  while(true) {
		  try {
			  m.oddNumber();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  }
  }
  }
   
   
public class MultiThreading {
	public static void main(String[] args) {
		 NumberManager m =new NumberManager();
		 numberGenerator a =new numberGenerator(m);
		 EvenPrinterThread b=new EvenPrinterThread(m);
		 OddPrinterThread c=new OddPrinterThread(m);
		 a.start();
		 b.start();
		 c.start();
		 

	}

}

