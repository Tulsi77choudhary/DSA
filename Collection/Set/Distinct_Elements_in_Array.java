package Collection.Set;
import java.util.*;
public class Distinct_Elements_in_Array {

    static int distinct(int[] arr){
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        System.out.println("Number of distinct elements: " + distinct(arr));
       
    }
    
}
