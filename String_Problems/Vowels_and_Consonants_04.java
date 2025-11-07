package String_Problems;

public class Vowels_and_Consonants_04 {
    public static void main(String[] args) {
        String str = "Hello world Dear";
        int vowels = 0, consonants = 0;

        for(char c : str.toCharArray()){
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                }else{
                    consonants++;
                } 
                
            }
            
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
