public class palindromic_pattern {
  public static void main(String[] args) {
     int n=5;
    //outer loop
       for(int i=1; i<=n;i++){
        //space print 
          for(int j=1; j<=n-i;j++){
            System.out.print(" ");

           }
          //first Half
           for(int j=i; j>=1;j--){
            System.out.print(j);
           }
           //second Half
           for(int j=2;j<=i;j++){
            System.out.print(j);
           }
           System.out.println();
        }
    }  
}
