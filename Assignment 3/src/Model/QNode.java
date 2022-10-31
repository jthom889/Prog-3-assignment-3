package Model;

/**
 * this class will create the variables and methods
 * required to use nodes in other areas and lists
 * @author Opemipo Lano
 *
 * @param <T> is a generic type that will be determined later
 */
public class QNode<T> {
	
	QNode<T> next;
	T data;
	
	/**
	 * this constructor will instantiate 
	 * the variables to be null.
	 * the basic constructor
	 */
	public QNode() {
		this.next = null;
		this.data = null;
	}
	
	/**
	 * this constructor will set the next variable to null
	 * but will hold a parameter of type T for the data
	 * @param t will be the data to store into 'data'
	 */
	public QNode(T t) {
		this.next = null;
		this.data = t;
	}

	public QNode<T> getNext() {
		return next;
	}

	public void setNext(QNode<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

}
