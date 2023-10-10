/*
 * File : FrequencyOfCharachter
 * Description : Find Frequency of a charachter in a string
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :25/09/2023
 */

package test;
import java.util.Scanner;
public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String word = sc.nextLine();
		System.out.println("Enter Character to be checked : ");
		char check = sc.next().charAt(0);
		int count =checkChar(word,check);
		if(count==0) {
			System.out.println("Charachter is not present in String");
		}
		else {
			System.out.println("Frequency count is "+count);
		}
	}


static int checkChar(String word,char check) {
	int count=0;
	char []charArray=word.toCharArray();
	for(int i=0;i<word.length();i++) {
		if(check==charArray[i]) {
			count++;
		}
	}
	return count;
}
}
