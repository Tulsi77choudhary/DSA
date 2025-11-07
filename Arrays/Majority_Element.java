

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Element {

    static List<Integer> findMajority(int[] nums){
        int n =  nums.length;
        Map<Integer,Integer> freqMap = new HashMap<>();
        
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> arr = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > n / 3){
                arr.add(entry.getKey());
            }
        }
        Collections.sort(arr);
        return arr;
        
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};

        List<Integer> list = findMajority(arr);
        for(int element : list){
            System.out.print(element + " ");
        }


    }
}
