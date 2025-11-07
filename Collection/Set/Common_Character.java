package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Common_Character {

    static String common(String str1){

        Set<Character> set = new HashSet<>();
        for(char ch :str1.toCharArray()){
            set.add(ch);
        }

        return str1;
    }
    public static void main(String[] args) {
        String str1 = "hello";

    }
}
