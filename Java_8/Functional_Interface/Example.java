package Functional_Interface;

/*
 * Functional Interface = An interface that contains only one abstract method.
 * 
 */
@FunctionalInterface
 interface Square {
    int calculate(int x);
    
}
@FunctionalInterface
 interface Triangle {
    int calculate(int y);
   
    
}
public class Example {
    public static void main(String[] args) {
        
        int a = 5;

        Square square = (x) -> x*x;
        Triangle triangle = (y) -> (y * (y + 1)) / 2;

        int ans = square.calculate(a);
        System.out.println("Square of " + a + " is: " + ans);
        int ans2 = triangle.calculate(a);
        System.out.println("Sum of first " + a + " natural numbers is: " + ans2);
    }
}
