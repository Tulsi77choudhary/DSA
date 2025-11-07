package Searching_Algorithum;

public class Linear_Search {
    static int search(int[] arr,int target){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        int m = search(arr, target);
        System.out.println(m);
    }
}
