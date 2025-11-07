package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demonstrat_Queue {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        System.out.println("Queue elements:" + queue);

        String first = queue.remove();
        System.out.println("Removed element: " + first);

        String second = queue.peek();
        System.out.println("Next element to be removed: " + second);
        queue.add("Orange");
        System.out.println("Queue after removal: " + queue);
    }
    
}
