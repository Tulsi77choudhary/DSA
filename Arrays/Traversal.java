
import java.util.Scanner;

public class Traversal {
    public static void Traversals(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for a clean line after traversal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array traversal using method: ");
        Traversals(arr);

        System.out.print("Array traversal using for-each loop: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}