package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example_02 {
    public static void main(String[] args) {
        Queue<Integer> queue  = new LinkedList<>();
        for(int i = 1; i < 10;i++){
            queue.add(i);
        }

        System.out.println(queue);

        int removal = queue.remove();
        System.out.println("Removed element: " + removal);
        int next = queue.peek();
        System.out.println("Next element to be removed: " + next); 
        queue.remove();
        System.out.println("Queue after removal: " + queue);
        System.out.println(queue);
    }
}
