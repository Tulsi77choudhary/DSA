package Collection.List;

import java.util.*;

public class StackExample {
    
    public static void main(String[] args) {
       
       Stack<Integer> stack = new Stack<>();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to push onto the stack:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        while (!stack.isEmpty()) {
        System.out.print(stack.pop() + " ");
        }
    }
}
