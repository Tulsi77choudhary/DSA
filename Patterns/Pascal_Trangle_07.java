public class Pascal_Trangle_07 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n - i;j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j)/(j+1);
            }
            System.out.println();
        }
    }
}
