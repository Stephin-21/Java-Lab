/*
 * File : SecondSmallestInArray
 * Description : Second Smallest Number In An Array
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :31/10/2023
 */

package test;
import java.util.Scanner;
public class SecondSmallestInArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int lim,i,j,temp;
		System.out.println("Enter Limit of the array");
		lim=sc.nextInt();
		int []ar1=new int[lim];
		//Inputing values into array
		System.out.println("Enter Values of Array ");
		for(i=0;i<lim;i++) {
			ar1[i]=sc.nextInt();
		}
		//Bubble Sorting the Array
		for(i=0;i<lim;i++) {
			for(j=i+1;j<lim;j++) {
			if(ar1[i]>ar1[j]){
				temp=ar1[i];
				ar1[i]=ar1[j];
				ar1[j]=temp;
			}
		}
		}
		
		System.out.println("Second Smallest element is : "+ar1[1]);
		
	}

}
