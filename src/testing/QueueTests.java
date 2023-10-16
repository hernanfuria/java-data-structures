package testing;

import implementations.Queue;

public class QueueTests {

	public static void main(String[] args) throws Exception {
		Queue<String> s = new Queue<>();
		s.insert("a");
		s.insert("b");
		s.insert("c");
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.remove());
		// System.out.println(s.remove()); // throws exception

	}

}
