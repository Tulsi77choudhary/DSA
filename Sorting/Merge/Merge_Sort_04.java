package Sorting.Merge;

public class Merge_Sort_04 {

    static void mergeSort(int[] arr, int left , int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, right);
            mergeSort(arr, mid + 1, right);
            merge(arr, left,mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1;i++){
            L[i] = arr[left + i];
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,1,4,5,7,9};
        
    }
}
