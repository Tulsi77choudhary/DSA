package String_Problems;

public class Reverse_01 {

    public static void main(String[] args) {
        // 1 step

        // String str = "Auto";
        // StringBuilder  sb = new StringBuilder(str).reverse();
        // System.out.println(sb);
       
        // 2 step
        String rev = "";
        String str = "Tulsi";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}