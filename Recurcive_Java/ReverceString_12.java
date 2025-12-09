public class ReverceString_12{

    static String reverse(String str){
        if(str.isEmpty())
            return str; 
        return reverse(str.substring(1)) + str.charAt(0);
        
    } 
    
    public static void main(String[] args) {
        String str = "tulsi";
        System.out.println(reverse(str));
    }
} 