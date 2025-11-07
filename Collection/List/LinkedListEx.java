package Collection.List;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add elements to the list
        list.add("Bhopali");
        list.add("Bihari");
        list.add("punjabi");
        list.add("bengali");
        list.add("gujrati");

        //remove elemrnts to the list
        list.removeLast();
        list.addLast("Marathi");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println("\nSize of the list : " +list.size());
        System.out.println("First element length :" + list.getFirst().indexOf("h"));
    }
}
