package ONE_D;
import java.util.Scanner;

public class Second_Largest {

/*    public static int SecondLarges(int[] arr){
        int n = arr.length;

        int largest = 0;
        int Second_Largest = 0;

     //  Find of largest  Number of Array 
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }

       // Find of SecondLargest Number of Array 

        for(int i = 0 ;i < n; i++){
            if(arr[i] > Second_Largest && arr[i] != largest){
                Second_Largest = arr[i];
            }
        }
        return Second_Largest;
    }
*/
    public static void main(String[] args) {
      //  int[] arr = {1,2,33,24,35,5};
      //  System.out.println(SecondLarges(arr));

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of arr : ");
      int n = sc.nextInt();

      int[] arr =  new int[n];

      int largest = arr[0];

        for( int i = 0; i < n ; i++){
          arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n ;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
         
        System.out.println("Largest Element :"+largest);

        sc.close();
    }
    
}
