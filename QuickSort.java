package test;

import java.util.Scanner;

public class QuickSort {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		
		quicksort(ar, 0, size-1);
		
		System.out.print("Sorted array:");
		for(int i=0;i<size;i++) {
			System.out.print(ar[i]+"  ");
		}
		System.out.println();
	}
	
public static void quicksort(int ar[],int start,int end) {
	int pivot,j,temp,i;
    if(start<end){
        pivot=start;
        i=start;
        j=end;
        
        while(i<j){
            while(ar[i]<=ar[pivot]&&i<end)
                i++;
            while(ar[j]>ar[pivot])
                j--;
            if(i<j){
                temp=ar[i];
                 ar[i]=ar[j];
                 ar[j]=temp;
            }
        }
        temp=ar[pivot];
        ar[pivot]=ar[j];
        ar[j]=temp;
        quicksort(ar,start,j-1);
        quicksort(ar,j+1,end);
   }
}
}
