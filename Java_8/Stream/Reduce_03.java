package Stream;

import java.util.List;

public class Reduce_03 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream()
            .reduce(0,(a,b) -> a + b);
        System.out.println("Sum is: " + sum);
    }
}
