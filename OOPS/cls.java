package OOPS;

import java.util.Arrays;

class Solution {
    static int insertInterval(int[][] intervals, int[] newInterval) {
    
        
        int cnt = 0;
        
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int end = intervals[0][1];
        
        for(int i = 1; i < intervals.length;i++){
            if(intervals[i][0] < end){
                cnt++;
                end = Math.max(intervals[i][1],end);
            }else{
                end = intervals[i][1];
            }
            
        }
        return cnt;
    }
    
    public static void main(String[] args){
       int[][] intervals = {{1,3},{4,5},{6,7},{8,10}};
       
       System.out.println(insertInterval(intervals, null));
       
   }
}
