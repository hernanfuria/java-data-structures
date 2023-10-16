package implementations;

public class LinkedList<T> {
	private Node<T> _head = null;
	private long _len = 0;
	
	public long index(T value) {
		/**
		 * @return the first appearance's index of the given value. Returns -1 if not found
    	 */
		return -1;
	}
	
	public void insert(T value, long index) {
		/**
		 * Inserts the given value into the list, in the given position/index
		 */
	}
	
	public T remove(T value) {
		/**
		 * Removes the first appearance's of the specified value from the list, 
		 * and returns it. If not found, returns null.
		 */
		
		return _head.getValue();
	}
	
	public void append(T value) {
		/**
		 * Inserts the given value at the 'beginning' of the list
		 */
	}
	
	public T pop(long index) {
		/**
		 * Removes the value at the given index or at the 'beginning' of the list 
		 * (if no index specified), and returns it
		 */
		
		return _head.getValue();
	}
	
	public boolean isEmpty() {
		/**
		 * Returns true if the list is empty, returns false otherwise
		 */
		return true;
	}
	
	public long length() {
		/**
		 * Returns the amount of elements inside the list
		 */
		return _len;
	}
	
	public String toString() {
		/**
		 * Returns a String representation of the list
		 */
		return "";
	}
}










