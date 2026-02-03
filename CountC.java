public class CountC {
    public static void main(String[] args) {
        String  string = "Automation";

        char ch = 't';
        int count = 0;

        for(int c : string.toCharArray()){
            if (c == ch) 
                count++;
            
        }
        System.out.print(count);
    }
}
