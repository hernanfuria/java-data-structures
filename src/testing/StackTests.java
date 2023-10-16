package testing;

import implementations.Stack;

public class StackTests {

	public static void main(String[] args) throws Exception {
		Stack<String> s = new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		// System.out.println(s.pop()); // throws exception
	}

}
