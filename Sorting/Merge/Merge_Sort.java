package DSA.Sorting.Merge;
public class Merge_Sort {
    public static void conquer(int arr[], int si, int ei, int mid) {
        int merged[] = new int[ei - si + 1];    

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {           
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;  // Correct mid calculation
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);  // Fix incorrect recursion

        conquer(arr, si, ei, mid);  // Merge the divided parts
    }

    public static void main(String[] args) {
        int arr[] = {9, 2,50, 4, 5, 7, 3, 1 ,12 ,13};
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print on same line
        }
        System.out.println();
    }
}
