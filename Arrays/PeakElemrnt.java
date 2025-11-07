import Sorting.Merge.prectice_03;

public class PeakElemrnt {
    public static int Peak(int[] arr){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean left = (mid == 0 || arr[mid] >= arr[mid - 1]);
            boolean right = (mid == arr.length - 1 || arr[mid] >= arr[mid + 1]);

            if(left && right){
                return mid;
            }else if(mid > 0 && arr[mid - 1] > arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,5,8};

        System.out.println(Peak(arr));

    }
    
}
