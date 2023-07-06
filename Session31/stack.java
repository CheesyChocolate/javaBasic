/** code the basic stack structure in java
 * write the code that prints all the elements of the stack, as long as the stack is not empty.
 * write the code that will take four oprations from user in the form of a character string, and
 * determine wether the parantheses in that opration are ordred properly or not.
 * for example : (a+b) is ordred properly, but (a+b)) is not ordred properly.
 **/

import java.util.Scanner;

public class stack {
	private int top;
	private int size;
	private char[] stack;

	public stack(int size) {
		this.size = size;
		stack = new char[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(char data) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			stack[++top] = data;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return ' ';
		} else {
			return stack[top--];
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return ' ';
		} else {
			return stack[top];
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the the expression: ");
		String expression = input.nextLine(); //this gets the expression
		stack stack = new stack(expression.length());
		System.out.print("check for witch character?( {} () [] ): ");
		char check = input.next().charAt(0); // this gets the character i'm checking against expration
		char decheck; //here i declre a varible for conterpart of chech, so for "{" i want "}"
		boolean isOrdered = true;
		if (check == '{') {
			decheck = '}';
		} else if (check == '(') {
			decheck = ')';
		} else if (check == '[') {
			decheck = ']';
		} else { //
			System.out.println("invalid character");
			return;
		}
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == check) {
				stack.push(expression.charAt(i));
			} else if (expression.charAt(i) == decheck) {
				if (stack.isEmpty()) {
					isOrdered = false;
					break;
				} else {
					stack.pop();
				}
			}
		}
		if (isOrdered && stack.isEmpty()) {
			System.out.println("The expression is ordred properly");
		} else {
			System.out.println("The expression is not ordred properly");
		}
	}
}
