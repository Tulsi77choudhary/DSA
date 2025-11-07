package Collection.Set;

import java.util.Set;
import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // set.add("Apple");
        // set.add("Banana");
        // set.add("Cherry");
        // set.add("Cherry");
        // set.contains("Banana");
        // set.size();

        // System.out.println("Set contains: " + set.toString());

        int[] arr = {1, 2, 3,3, 4, 5};
        Set<Integer> integers = new HashSet<>();
        for(int num :arr){
            integers.add(num);
        }
        System.out.println("Set of integers: " + integers);
    }
    
}
