package Model;

/**
 * this interface creates the methods 
 * needed for any type of list
 * @author jonah thompson
 *
 * @param <T> is the generic type
 */
public interface QueueInterface<T> {

	void enqueue(T t);
	T dequeue();
	T peek();
	int getSize();
	boolean isEmpty();
	void printQueue();
	
}
