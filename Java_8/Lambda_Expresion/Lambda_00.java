package Lambda_Expresion;

/*  Lambda Expression =  Lambda expression is a short way to write a function without a name.
        It makes code simpler and cleaner, especially for small tasks.
 * 
 *   Types of Lambda Expression:
 *   1. No parameter: () -> System.out.println("Hello, World!");
 *   2. One parameter: (x) -> x * x;
 *   3. Multiple parameters: (x, y) -> x + y;
 */

@FunctionalInterface
interface ZeroParameter {
    void display();
}

public class Lambda_00 {
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()
            -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
    }
}