package Collection.List;

import java.util.*;
public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4, 6);
        list.remove(0);
        list.remove(Integer.valueOf(3));
        Collections.sort(list);
        

        for(int num : list){
            System.out.print(num + " ");
            
        }
        System.out.println("\nSize of the list : "+list.size());
        System.out.println(list.get( 2));
       
    }
}
