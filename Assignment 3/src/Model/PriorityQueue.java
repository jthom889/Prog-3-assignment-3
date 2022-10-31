package Model;

import java.util.NoSuchElementException;

/**
 * this class will set up all variables and methods
required to create a priorityQueue of any type
 * @author Jonah Thompson
 *
 * @param <T> is the generic type
 */
public class PriorityQueue<T> implements QueueInterface<T> {

	private QNode<T> front;
	private QNode<T> rear;
	private int size;
	
	/**
	 * this constructor will initialize 
	 * the variables to be null
	 */
	public PriorityQueue() {
		front = null;
		rear = null;
		size = 0;
		
	}
	
	@Override 
	/**
	 * this method will add data to the PriorityQueue 
	 * in terms of its priority. it will add a value 
	 * by terms of ascending order
	 * @param t is the data to add to the list
	 */
	public void enqueue(T t) {
		
		QNode<T> curr = front;
		QNode<T> toAdd = new QNode<T>(t);
		
		
		if(isEmpty())
			front = new QNode<T>(t);
		
		else {
			
			@SuppressWarnings("unchecked")
			Comparable<T> comp = (Comparable<T>)t;
		
			for(int i = 0; i < size; i++) {
				
				int result = comp.compareTo(curr.getData());
				
				//add at first position
				if(i == 0 && result < 0) {
					toAdd.setNext(front);
					front = toAdd;
					break;
				}
				
				//add before but not first
				else if(result < 0) {
					toAdd.setNext(curr.getNext());
					curr.setNext(toAdd);
					break;
				}
				
				//last spot
				else if(curr.getNext() == null) {
					curr.setNext(toAdd);
					rear = toAdd;
					break;
				}
					
				curr = curr.getNext();	
			}
		}
		size++;
	}
	
	@Override
	/**
	 * this method will remove an object if the queue is not empty 
	 * based on when the object was added. follows FIFO
	 * @throws NoSuchElementException if the queue is already empty
	 * @return the data that was dequeued
	 */
	public T dequeue() {
		
		if(isEmpty()) 
			throw new NoSuchElementException();
		
		T temp = front.getData();
		front = front.getNext();
		size--;
		return temp;			
	}
	
	@Override
	/**
	 * this method will get the top element that is 
	 * next to remove but will not remove it
	 * @throws NoSuchElementException if the queue is already empty
	 * @return the data that is next to remove
	 */
	public T peek() {
		
		if(isEmpty())
			throw new NoSuchElementException();
		
		return front.getData();
	}
	
	@Override
	/**
	 * this method will check the list and return true if
	 *  it is empty or false if it is not empty
	 *  @return true if it is empty or false if it is not empty
	 */
	public boolean isEmpty() {
		if(front == null && rear == null)
			return true;
		return false;
	}
	
	@Override
	/**
	 * this method will print the queue 
	 * without removing the values
	 */
	public void printQueue() {
	
		QNode<T> current = new QNode<T>();
		current = front;
		
		while(current.getNext() != null) {
			System.out.println(current);
			current = current.getNext();
			
		}
		
	}
	
	@Override
	public int getSize() {
		return size;
	}
	
}
