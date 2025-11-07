package Exception_Handling;

public class main{
    public static void main(String[] args) {
        int n =  12;
        int m = 2;

        try{
            
            int ans = n * m;
            System.out.println("Ans : " + ans);

        }catch(ArithmeticException e){

            System.out.println("Error: Division by zero is not allowed!");

        }finally{

            System.out.println("Program continues after handling the exception.");
        }
    }
}