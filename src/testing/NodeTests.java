package testing;

import implementations.Node;

public class NodeTests {
	
	public static void main(String[] args) {
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		n1.setNext(n2);
		Node n3 = n2.getNext();
		System.out.println(n3.getValue());
	}
}
