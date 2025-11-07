import java.util.Arrays;

public class Minimize_Height_08 {

    static int MinDiff(int[] arr, int n , int k){

        int m = arr.length;
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for(int i = 1; i < n; i++){
            if(arr[i] < k) continue;

            int min = Math.min(smallest, arr[i] - k);
            int max = Math.max(largest,arr[i - 1] + k);

            ans = Math.min(ans, max - min);
        }
        return  ans   ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};

        int  k = 2;
        int n = arr.length;

        System.out.println(MinDiff(arr, n, k));

    }
    
}
