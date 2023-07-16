package org.arraystack;

public class MainArrayStack {
	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(10);

		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));
		stack.push(new Employee("6", "6", 6));
		stack.push(new Employee("7", "7", 7));
		stack.push(new Employee("8", "8", 8));
		stack.push(new Employee("9", "9", 9));
		stack.push(new Employee("10", "10", 10));
		stack.push(new Employee("11", "11", 11));
		stack.push(new Employee("12", "12", 12));
		stack.push(new Employee("13", "13", 13));

		//stack.printStack();

		System.out.println(stack.peek());
		//stack.printStack();

		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());

	}
}