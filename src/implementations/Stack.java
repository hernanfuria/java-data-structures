package implementations;

public class Stack<T> {
	private LinkedList<T> _values;
	
	public void push(T value) {
		/**
		 * Inserts a value to the stack
		 */
		
		_values.append(value);
	}
	
	public T pop() {
		/**
		 * Removes the value at the top of the stack and returns it
		 */
	}
	
	public boolean isEmpty() {
		/**
		 * @return true if the stack is empty, returns false otherwise
		 */
	}

}
