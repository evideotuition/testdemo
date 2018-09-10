package Stack;

public class Runner {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		stack.push(11);
		stack.show();
		stack.pop();
		stack.pop();
		stack.push(9);
		stack.push(11);
		stack.show();
	}

}
