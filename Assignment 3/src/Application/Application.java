package Application;

import java.util.Scanner;

import Model.LinkedQueue;
import Model.PriorityQueue;
import Model.QueueInterface;

/**
 * this class will set up and run the program. it will also create
 * a method to print the contents of any QueueInterface
 * @author Opemipo Lano
 *
 */
public class Application {

	/**
	 * in this main method the program will be operated and ran
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedQueue<String> lq = new LinkedQueue<String>();
		PriorityQueue<String> pq = new PriorityQueue<String>();
		Scanner kb = new Scanner(System.in);
		String name;
		int number = -1;
		
		//validating the input with a loop
		do {
			
			System.out.println("How many names would you like to print: ");
			String num = kb.nextLine();	
			
			try {
			
				number = Integer.parseInt(num);
				
			}catch(NumberFormatException e){
				System.out.println("Must be a positive integer, try again.");
			}
				
		} while(number < 1);
		
		//writing a name n number of times
		for(int i = 0; i < number; i++) {
			System.out.println("Write a name: ");
			name = kb.nextLine();
			lq.enqueue(name);
			pq.enqueue(name);
		}
		
		for(int i = 0; i < 2; i++) {
			if(lq.getSize() != 0) {
				System.out.println("Linked Queue name: " + lq.dequeue());
				System.out.println("Priority Queue name: " + pq.dequeue());
			}
		}
		
	}
	
	/**
	 * this method will print the contents of 
	 * any QueueInterface without removing it
	 * @param q
	 */
	public static void printing(QueueInterface q) {
		q.printQueue();
		
	}
}
