package Sorting.Bubble;
public class Bubble_Sort_int_01 {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {9, 7, 8 ,1 ,35,5,12,34,234 };

        //Bubble Sort
        for(int i=0; i<arr.length-1; i++){ 
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){

                    //Swap
                    int num= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
               
            }
           
        }
        printArray(arr);
        
    }
}
