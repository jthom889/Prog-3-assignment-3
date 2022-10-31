package Model;

import java.util.NoSuchElementException;

/**
 * this class will set up all required methods
 *  and variables needed to create a linked queue
 * @author Opemipo Lano
 * @param <T> is the generic type so that queue 
 * can be created using any object
 */
public class LinkedQueue<T> implements QueueInterface<T> {

	private QNode<T> front;
	private QNode<T> rear ;
	private int size;
	
	/**
	 * this constructor will instantiate the linkedQueue
	 * and set the variables to null
	 */
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
		
	}
	
	@Override 
	/**
	 * this method will add an object to the back of 
	 * the queue or in the first position if it is empty
	 * @param t is the object of type T t add
	 */
	public void enqueue(T t) {
		
		//if size is 0
		if(isEmpty()) {
			front = new QNode<T>(t);
			rear = new QNode<T>(t);
			
		//if there is one element	
		}else if(size == 1) {
			rear.setData(t);
			front.setNext(rear);
							
		//if size is > 1	
		}else if(rear.getNext() == null) {
			QNode<T> temp = new QNode<T>(t);
			rear.setNext(temp);
			rear = temp;
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
