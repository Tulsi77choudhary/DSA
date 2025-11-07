package Collection.Set;

import java.util.Set;
import java.util.HashSet;

public class Intersection_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Set<Integer> set = new HashSet<>();
        for(int num :arr1)
        set.add(num);

       Set<Integer> result = new HashSet<>();

        for(int num : arr2){
            if(set.contains(num)){
              result.add(num);
            }
        }
        System.out.println(result);
    }
    
}
