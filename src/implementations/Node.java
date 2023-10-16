package implementations;

public class Node {
	private Object _value = null;
	private Node _next_node = null;
	
	public Node(Object value) {
		setValue(value);
	}
	
	public Node(Object value, Node next_node) {
		setValue(value);
		setNext(next_node);
	}
	
	public void setValue(Object value) {
		/**
		 * Sets the value stored in the Node
		 * @param value
		 *        Any object
		 */
		_value = value;
	}
	
	public Object getValue() {
		/**
		 * Returns the value stored in the Node
		 * @return value Object
		 */
		return _value;
	}
	
	public void setNext(Node next_node) {
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

	public Object getNext() {
		/**
		 * Returns next Node
		 * @returns Node object or null
		 */
		return _next_node;
	}
	
	public Object pop() {
		/**
		 * Returns the value stored in the Node after changing it by null
		 * @return value Object
		 */
		Object aux = getValue();
		setValue(null);
		return aux;
	}
	
}
