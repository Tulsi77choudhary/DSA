package Stream;

import java.util.Arrays;
import java.util.List;
public class Map_02 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100);

        numbers.stream()
            .map(n -> n * n)
            .forEach(System.out::println);
    }
}
