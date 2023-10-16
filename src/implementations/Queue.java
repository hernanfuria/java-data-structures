package implementations;

public class Queue<T> {
	private LinkedList<T> _values = new LinkedList<>();
	
	public void insert(T value) {
		/**
		 * Inserts a value at the end of the queue
		 */
		
		_values.append(value);
	}
	
	public T remove() throws Exception {
		/**
		 * Removes the value at the beginning of the queue and returns it
		 */
		
		if (isEmpty()) {
			throw new Exception("Can't remove from queue because it's empty");
		}
		
		return _values.pop(0);
	}
	
	public boolean isEmpty() {
		/**
		 * @return true if the queue is empty, returns false otherwise
		 */
		
		return _values.isEmpty();
	}
}
