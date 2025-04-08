package guvitask4;
	import java.util.Stack;

	public class IntegerStack {
	    private Stack<Integer> stack;

	    // Constructor
	    public IntegerStack() {
	        stack = new Stack<>();
	    }

	    // a. Function to push elements onto the stack
	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println("Pushed: " + element);
	    }

	    // b. Function to pop elements from the stack
	    public void popElement() {
	        if (!stack.isEmpty()) {
	            int removedElement = stack.pop();
	            System.out.println("Popped: " + removedElement);
	        } else {
	            System.out.println("Stack is empty. Nothing to pop.");
	        }
	    }

	    // c. Function to check if the stack is empty
	    public boolean isStackEmpty() {
	        return stack.isEmpty();
	    }

	    // d. Function to display the stack contents
	    public void displayStack() {
	        System.out.println("Stack Contents: " + stack);
	    }

	    // Main Method
	    public static void main(String[] args) {
	        IntegerStack myStack = new IntegerStack();

	        // Pushing elements
	        myStack.pushElement(10);
	        myStack.pushElement(20);
	        myStack.pushElement(30);

	        // Display stack
	        myStack.displayStack();

	        // Popping an element
	        myStack.popElement();
	        
	        // Display stack after popping
	        myStack.displayStack();

	        // Checking if stack is empty
	        if (myStack.isStackEmpty()) {
	            System.out.println("The stack is empty.");
	        } else {
	            System.out.println("The stack is NOT empty.");
	        }
	    }
	}