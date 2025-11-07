package TWO_D;

public class Find_Number {

    static boolean findNumber(int[][] matrix, int target){
        int rows = matrix.length;
        int n = target;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == n){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 10;
        boolean found = findNumber(matrix, target);
        System.out.println("Number " + target + " found: " + found);
    }
}
