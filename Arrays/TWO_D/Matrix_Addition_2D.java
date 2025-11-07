package TWO_D;

import java.util.Scanner;

public class Matrix_Addition_2D {

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of colums : ");
        int colums = sc.nextInt();

        int[][] matrix1 = new int[rows][colums];
        int[][] matrix2 = new int[rows][colums];

        int[][] sum = new int[rows][colums];

        System.out.println("Enter elements of Matrix 1 :");

        for(int i = 0;i < rows; i++){
            for(int j = 0; j < colums; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2 :");
        for(int i = 0;i < rows; i++){
            for(int j= 0 ; j < colums; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrix :");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <colums; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sum);
        sc.close();

    } 


}
