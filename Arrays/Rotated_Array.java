
public class Rotated_Array {

    public static void Rotation(int[] arr, int d){
        int n = arr.length;

        d %= n;

        // int[] temp = new int[n];

        // for(int i = 0; i < n - d;i++){
        //     temp[i] = arr[d + i];
        // }

        // for(int i = 0; i < d; i++){
        //     temp[n - d + i] = arr[i];
        // }

        // for(int i = 0; i < n; i++ ){
        //     arr[i] = temp[i];
        // }


        reverse(arr, 0, d - 1);

        reverse(arr, d , n - 1);
        
        reverse(arr, 0 , n - 1);
    }

    public static void reverse(int[] arr, int  start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int d = 2;
        
        Rotation(arr, d);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
