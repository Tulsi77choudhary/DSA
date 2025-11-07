package Collection.Queue;

import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public void push(int value){
        stack.push(value);
    }
    
    public int dequeue() {
        if(stack.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if (tempStack.isEmpty()) {
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }
        }
        return tempStack.pop();
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(tempStack.isEmpty()){
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }
        }
        return tempStack.peek();
    }

    private boolean isEmpty() {
        return stack.isEmpty() && tempStack.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        
    }
    
}
