package Sorting.Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Element_01 {

    static int findKthLargest(int[] arr,int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,7,4,3}; 
        int k = 3;
        System.out.println(findKthLargest(arr,k));
    }
}
