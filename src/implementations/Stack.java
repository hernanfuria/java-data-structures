package implementations;

public class Stack<T> {
	private LinkedList<T> _values;
	
	public void push(T value) throws Exception {
		/**
		 * Inserts a value to the stack
		 */
		
		_values.insert(value, 0);
	}
	
	public T pop() throws Exception {
		/**
		 * Removes the value at the top of the stack and returns it
		 */
		
		if (isEmpty()) {
			throw new Exception("Can't pop from stack because is empty");
		}
		
		return _values.pop(0);
	}
	
	public boolean isEmpty() {
		/**
		 * @return true if the stack is empty, returns false otherwise
		 */
		
		return _values.isEmpty();
	}

}
