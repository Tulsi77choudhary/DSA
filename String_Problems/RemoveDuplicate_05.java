package String_Problems;

import java.util.Scanner;

public class RemoveDuplicate_05 {

    static String remove(String str){

        String string = "";
        for(int i = 0;  i < str.length(); i++){
           int count = 0;
            if(str.charAt(i) != ' '){
               for(int j = i + 1 ; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j) && i != j){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    string +=  str.charAt(i);
                }
            }
        }

        return string;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        sc.close();

        System.out.println(remove(str));
    

    }
}