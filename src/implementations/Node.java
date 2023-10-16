package implementations;

public class Node<T> {
	private T _value = null;
	private Node<T> _next_node = null;
	
	public Node(T value) {
		setValue(value);
	}
	
	public Node(T value, Node<T> next_node) {
		setValue(value);
		setNext(next_node);
	}
	
	public void setValue(T value) {
		/**
		 * Sets the value stored in the Node
		 * @param value
		 *        Any object
		 */
		_value = value;
	}
	
	public T getValue() {
		/**
		 * Returns the value stored in the Node
		 * @return value Object
		 */
		return _value;
	}
	
	public void setNext(Node<T> next_node) {
		/**
		 * Sets next Node
		 * @param next_node
		 *        Node object*/
		_next_node = next_node;
	}
	
	public void setNextToNull() {
		/**
		 * Sets null as next Node
		 */
		_next_node = null;
	}

	public Node<T> getNext() {
		/**
		 * Returns next Node
		 * @returns Node object or null
		 */
		return _next_node;
	}
	
	public T pop() {
		/**
		 * Returns the value stored in the Node after changing it by null
		 * @return value Object
		 */
		T popped = getValue();
		setValue(null);
		return popped;
	}
	
}
