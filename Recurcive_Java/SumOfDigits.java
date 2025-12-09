public class SumOfDigits {

    static int SumOfDigits(int n){
        if(n == 0) return 0;

        return (n % 10) + SumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234567;
        System.out.println(SumOfDigits(n));
    }
}
