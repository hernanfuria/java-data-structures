package implementations;

public class LinkedList<T> {
	private Node<T> _head = null;
	private long _len = 0;
	
	public long index(T value) {
		/**
		 * @return the first appearance's index of the given value. Returns -1 if not found
    	 */
		
		Node<T> pointer = _head;
		for (long i = 0; i < length(); i++) {
			if (pointer.getValue() == value) {
				return i;
			}
			pointer = pointer.getNext();
		}
		return -1;
	}
	
	public void insert(T value, long index) throws Exception {
		/**
		 * Inserts the given value into the list, in the given position/index
		 */
		
		if (index < 0 || index > length()) {
			throw new Exception("Can't insert value into the list because given index is not valid");
		}
		
		if (index == 0) {
			Node<T> new_node = new Node<>(value);
			new_node.setNext(_head);
			_head = new_node;
		} else {
			Node<T> pointer = _head;
			for (long i = 0; i < index - 1; i++) {
				pointer = pointer.getNext();
			}
			Node<T> new_node = new Node<>(value);
			new_node.setNext(pointer.getNext());
			pointer.setNext(new_node);
		}
		
		_len++;
	}
	
	public T remove(T value) {
		/**
		 * Removes the first appearance's of the specified value from the list, 
		 * and returns it. If not found, returns null.
		 */
		
		if (!isEmpty()) {
			// handles the case when the value is in the first position
			if (_head.getValue() == value) {
				_head = _head.getNext();
				_len--;
				return value;
			}
			
			// handles the case when the value is NOT in the first position
			Node<T> pointer = _head;
			for (long i = 0; i < length() - 1; i++) {
				if (pointer.getNext().getValue() == value) {
					pointer.setNext(pointer.getNext().getNext());
					_len--;
					return value;
				}
				pointer = pointer.getNext();
			}
			
		}
		
		return null;
	}
	
	public void append(T value) {
		/**
		 * Inserts the given value at the 'end' of the list
		 */
		
		try {
			insert(value, length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public T pop() throws Exception {
		/**
		 * Removes the value at the 'end' of the list and returns it
		 */
		
		return pop(length() - 1);
	}
	
	public T pop(long index) throws Exception {
		/**
		 * Removes the value at the given index or at the 'end' of the list 
		 * (if no index specified), and returns it
		 */
		
		if (index < 0 || index >= length()) {
			throw new Exception("Can't pop value from the list because given index is not valid");
		}
		
		// handles the case when the value is in the first position
		if (index == 0) {
			T val = _head.getValue();
			_head = _head.getNext();
			_len--;
			return val;
		}
		
		// handles the case when the value is NOT in the first position
		Node<T> pointer = _head;
		for (long i = 0; i < index - 1; i++) {
			pointer = pointer.getNext();
		}
		T val = pointer.getNext().getValue();
		pointer.setNext(pointer.getNext().getNext());
		_len--;
		return val;
	}
	
	public boolean isEmpty() {
		/**
		 * Returns true if the list is empty, returns false otherwise
		 */
		return _head == null;
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
		
		if (!isEmpty()) {
			String text = "[";
			Node<T> pointer = _head;
			for (long i = 0; i < length(); i++) {
				text = text + pointer.getValue() + ", ";
				pointer = pointer.getNext();
 			}
			text = text.substring(0, text.length() - 2) + "]";
			return text;
		}
		
		return "[]";
	}
}










