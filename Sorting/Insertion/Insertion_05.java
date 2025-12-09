package Sorting.Insertion;

public class Insertion_05 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,8};
        
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
