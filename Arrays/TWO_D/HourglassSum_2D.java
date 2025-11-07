package TWO_D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HourglassSum_2D {

    public static int HourglassSum(int[][] arr){

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < 4; i++){

            for(int j = 0 ; j<4; j++){
               
                int top = arr[i][j] + arr[i][j+1] + arr[i+1][j+2];
                int middle = arr[i +1][j+1];
                int bottom = arr[i+2][j] + arr[i + 2][j+1] + arr[i+1][j+2];

                int HourglassSum = top + middle + bottom;

                maxSum = Math.max(maxSum,HourglassSum);
            }
        }
        return 0;
        
    }

    public static void main(String[] args) throws IOException {
    
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr =  new int[6][6];

        for(int i =0; i<6;i++){
            String[] arrRowItems = bufferedReader.readLine().split(" ");
            for(int j= 0;j<6;j++){
                arr[i][j] = Integer.parseInt(arrRowItems[j]);
            }
        }
        bufferedReader.close();

        System.out.println(HourglassSum(arr));
    }
    
}
