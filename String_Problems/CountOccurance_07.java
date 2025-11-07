package String_Problems;

import java.util.Scanner;

public class CountOccurance_07 {

    static String  CountOccuranceOfNumber(String str ){
        String string = "";
        char[] arr = new char[str.length()];
        int c = 0;
        for(int i = 0; i < str.length(); i++){
           int count = 1;   
            if(str.charAt(i) != ' '){
               for( int j = i + 1; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j) && i != j){
                        count++;

                    }
                }
                if(count == 1){
                   arr[c++] = str.charAt(i);
                }      
            }
        }
        for(int i = 0; i < arr.length; i++){
            int count2 = 0;
            if(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z'){
                for(int j = 0; j < str.length(); j++){
                    if(arr[i] == str.charAt(j)){
                        count2++;
                    }
                }
                string += arr[i] + " : " + count2 + "\n";
            }
        }
        return string;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        sc.close();

        System.out.println(CountOccuranceOfNumber(str));

    }
}
