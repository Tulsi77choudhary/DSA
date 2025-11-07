package String_Problems;

public class Polindrom_06 {
    public static void main(String[] args) {
        String str = "rabar";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i-- ){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palondrom");
        }else{
            System.out.println("Not");
        }
    }
}
