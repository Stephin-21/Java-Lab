/* File : DoublyLinkedListDemo
 * Description : Create a doubly linked list of elements.
 * Author : Stephin Mathew
 * Version : 1.0
 * Date :8/12/2023
 */

package stephin;
import java.util.LinkedList;
import java.util.Scanner;
class DoublyLinkedList <T>{
	private LinkedList <T> list=new LinkedList<>();
	public void insertAtFront(T item) {
		list.addFirst(item);
	}
	
	public void insertAtEnd(T item) {
		list.addLast(item);
	}
	
	public void insertAtAnyPosition(int index,T item) {
		list.add(index, item);
	}
	
	
	public T removeAtAnyPosition(int index) {
		return list.remove(index);
	}
	
	public void display() {
		for(T element:list) {
			System.out.println(element);
		}
	}
}


public class DoublyLinkedListDemo{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList <Integer> doublyLinkedList= new DoublyLinkedList();
		int choice,item,index;
		
		
		 do {
			 System.out.println("Enter choice "
						+ "1) Insert At Front "
						+ "2) Insert At End "
						+ "3) Insert At Any Position "
						+ "4) Delete At Any Position "
						+ "5) Display "
						+ "6) Exit ");

				choice=sc.nextInt();
		switch(choice) {
		case 1 :{
			System.out.println("Enter Element to Insert at Front : ");
			item=sc.nextInt();
			doublyLinkedList.insertAtFront(item);
			break;
		}
		case 2 :{
			System.out.println("Enter Element to Insert at End : ");
			item=sc.nextInt();
			doublyLinkedList.insertAtEnd(item);
			break;
		}
		case 3 :{
			System.out.println("Enter index for inserion : ");
			index=sc.nextInt();
			System.out.println("Enter Element to Insert : ");
			item=sc.nextInt();
			doublyLinkedList.insertAtAnyPosition(index,item);
			break;
			
		}
		
		case 4 :{
			System.out.println("Enter index of Element to be deleted :  ");
			index=sc.nextInt();
			item=doublyLinkedList.removeAtAnyPosition(index);
			System.out.println("Removed Element is : "+item);
			break;
		}
		case 5:{
			System.out.println("Doubly Linked List : ");
			doublyLinkedList.display();
			break;
		}
		default :
			System.out.println("Invalid Choice ");
		}
		
	}while(choice!=6);
	}
}
