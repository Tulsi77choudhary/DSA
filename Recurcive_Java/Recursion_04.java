public class Recursion_04 {
    public static void printmulti(int i, int n,int multi){
        if(i==n){
            multi *= i;
            System.out.println(multi);
            return;
        }
        multi *= i;
        printmulti(i+1,n, multi);
    }

    public static void main(String[] args) {
        int n =1;
        printmulti(1,5,1);
    }

}
