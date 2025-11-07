package Basic_Program;
public class Add_Two_Binary_String {

    static String add_Binary(String x,String y){
        
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);

        int sum = num1 + num2;

        String result  = Integer.toBinaryString(sum);

        return result;
    
    }
    public static void main(String[] args) {
        
        String x = "10";
        String y = "01";

        System.out.println(add_Binary(x, y));

    }
}