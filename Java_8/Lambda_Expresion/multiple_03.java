package Lambda_Expresion;

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
    
}
public class multiple_03 {
    public static void main(String[] args) {
        
        Functional addtion = (a,b) -> a + b;
        Functional subtraction = (a,b) -> a - b;

        System.out.println("Addition: " + addtion.operation(10, 5));
        System.out.println("Subtraction: " + subtraction.operation(10, 5));
    }
}

