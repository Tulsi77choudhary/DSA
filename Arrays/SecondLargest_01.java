

public class SecondLargest_01{
    public static int getSecondLargest(int[] arr) {

      int  n = arr.length;
      
      int largest = -1;
      int secondLargest = -1;

        for(int i = 0; i < n ; i++ ){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
       return secondLargest;

    }
    public static void main(String[] args){
        
        int[] arr =  {12,34, 22,650,234,24};
        System.out.println("Second largest element = "+ getSecondLargest(arr));
        
    }
 
 
}