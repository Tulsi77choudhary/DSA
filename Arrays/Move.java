public class Move {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,80};
        boolean  sort = true;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                sort = false;
                break;
            }
        }
        if (sort) {
            System.out.println("Arr");
        }else{
            System.out.println("Arrrr");
        }

    }
}
