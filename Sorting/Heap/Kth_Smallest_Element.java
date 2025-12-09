package Sorting.Heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element {
    static int smallestElement(int[] arr, int k){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {22,23,11,54,66,35,87};
        int k = 1;
        System.out.println(smallestElement(arr, k));
    }
}
