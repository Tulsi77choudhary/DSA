package Searching_Algorithum;

public class Number_of_occurrence {

    static int Occurrence(int[] arr,int target){
        int n = arr.length;
        int m = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                m++;
            }
        }

        return m;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,4,5};
        int target = 2;

        System.out.println(Occurrence(arr,target));
    }
    
}


