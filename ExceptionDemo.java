package test;

public class ExceptionDemo {
	public static void main(String args[]) {
		 int a=10;
		 try {
		//Arithmetic Exception
		 a=a/0;
		//IndexOutOfBoundsException	 
		int [] array = new int[5];
		array[7]=10;
		//NumberFormatException
		 String b="123";
		 System.out.println(Integer.parseInt(b));
		 }
		 
		 catch(ArithmeticException e) {
			 //e.printStackTrace();
			 System.out.println("This is a Arithmetic Exception");
		 }
		 
		 catch(NumberFormatException e) {
			 e.printStackTrace();
			 System.out.println("This is a Number Format Exception");
		 }
		 
		 catch(IndexOutOfBoundsException e ) {
			 System.out.println("This is a IndexOutOfBoundsException");
		 }
		 
		 catch(Exception e) {
			 System.out.println("This Is a general exception");
		 }
		 
		 finally {
			 System.out.println("This block Executes no matter what");
		 }
	 }
	}


