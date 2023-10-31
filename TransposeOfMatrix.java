/*
 * File : TransposeOfMatrix
 * Description : Transposing of Matrix
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :31/10/2023
 */

package test;
import java.util.Scanner;
public class TransposeOfMatrix {
 public static void main(String [] args) {
	 Scanner sc= new Scanner(System.in);
	 int r1,c1,i,j;
	 System.out.println("Enter number of rows and coloumns of Matrix");
	 r1=sc.nextInt();
	 c1=sc.nextInt();
	 int [][]ar1 = new int[r1][c1];
	 int [][]ar2 = new int[c1][r1];
	 System.out.println("Enter values of the matrix : ");
	 // Inputing Values of Matrix 
	 for(i=0;i<r1;i++) {
		 for(j=0;j<c1;j++) {
			 ar1[i][j]=sc.nextInt();
		 }
	 }
	 //Transposing Matrix
	 for(i=0;i<r1;i++) {
		 for(j=0;j<c1;j++) {
			 ar2[j][i]=ar1[i][j];
		 }
	 }
	 
	 //Printing Transposed Matrix
	 System.out.println("Transpose Matrix : ");
	 for(i=0;i<c1;i++) {
		 for(j=0;j<r1;j++) {
			 System.out.print(ar2[i][j]+ " ");
		 }
		 System.out.println();
 }
}
}
