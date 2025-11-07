package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Queue<Integer> queue = new LinkedList<>();

        for(int num : arr){
            queue.add(num);
        }
        System.out.println("Queue: " + queue);
        
    }
    
}
