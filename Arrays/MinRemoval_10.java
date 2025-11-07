

import java.util.Arrays;
import java.util.Scanner;

public class MinRemoval_10 {

    static int MinRemoval(int[][] intervals){
        int cnt = 0;

        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        int end = intervals[0][1];

        for(int i = 1; i < intervals.length;i++){
            if(intervals[i][0] < end){
                cnt++;
                end = Math.min(intervals[i][1],end);

            }else{
                end = intervals[i][1];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Scanner sc = new  Scanner(System.in);
        // System.out.println("Enter your arr");

        // int n = sc.nextInt();
        // int[][] intervals = new int[n][2];

        // System.out.println("Enter intervals ");

        // for(int i = 0;i < n; i++){
        //     intervals[i][0] = sc.nextInt();
        //     intervals[i][1] = sc.nextInt();
        // }
        // int result = MinRemoval(intervals);

        // System.out.println(result);

        // sc.close();

        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        System.out.println(MinRemoval(intervals));


    }
    
}
