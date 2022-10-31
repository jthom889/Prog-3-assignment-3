package Model;

public interface QueueInterface<T> {

	void enqueue(T t);
	T dequeue();
	T peek();
	int getSize();
	boolean isEmpty();
	void printQueue();
	
}
