package testing;

import implementations.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) throws Exception {
		LinkedList<String> ll = new LinkedList<>();
		ll.append("Hola");
		ll.insert("Chau", 1);
		ll.append("lololo");
		ll.append("asd");
		System.out.println(ll);
		System.out.println(ll.index("lololo"));
		ll.remove("lololo");
		System.out.println(ll);
		ll.pop(0);
		System.out.println(ll);
		System.out.println(ll.length());
		System.out.println(ll.isEmpty());
	}

}
