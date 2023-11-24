/*
 * File : FileHandling
 * Description : Copying data from one file to another
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :24/11/2023
 */

package test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	 public static void main(String [] args) {
		FileReader input= null;
		FileWriter output= null;
		FileWriter output2=null;
		char [] array=new char[50];
		String input1="Hello World";
		
		try{
			output=new FileWriter("outputfile.txt");
			output.write(input1);
			output.flush();
			output.close();
			
			
			input = new FileReader("outputfile.txt");
			int bytes=input.read(array);
			
			
			output2 = new FileWriter("outputfile2.txt");
			output2.write(array,0,bytes);
			output2.flush();
			output2.close();
			
		}catch(IOException e ) {
			e.printStackTrace();
		}

	}
	}

