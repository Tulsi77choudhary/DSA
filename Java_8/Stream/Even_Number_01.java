package Stream;

import java.util.List;
import java.util.Arrays;

public class Even_Number_01 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100);

        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.print(n + " "));
        
    }
}
