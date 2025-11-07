

public class InversionCount {

    static int inversionCount(int[] arr){
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0,arr.length - 1);
    }
  
    static int mergeSort(int[] arr, int[] temp, int left, int right ){
        int incount = 0;

        if(left < right){
            int mid = (left + right)/2;

            incount += mergeSort(arr, temp, left,mid);
            incount += mergeSort(arr, temp,mid + 1, right);
            incount += merge(arr, temp,left,right,mid);
        }
        return incount;
    }
     

    static int merge(int[] arr, int[] temp , int left, int mid,int right ){

        int i = left ;
        int j = mid + 1;
        int k = left;
        int incount = 0;    


        while (i <= mid && j <= right) {
            if(arr[i] < arr[j]){
                temp[k++] = arr[i];
            }else{
                temp[k++] = arr[j++];
                incount += mid - i + 1;
            }
            
        }

        while (i <= mid) 
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];
        for(i = left; i<= right; i++){
            arr[i] = temp[i];
        }

        return incount;
    }
    

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};

        System.out.println(inversionCount(arr));
    }
    
}
