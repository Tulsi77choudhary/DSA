package TWO_D;

import java.util.Scanner;

public class Matrix_Subtract_2D {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of colums : ");
        int colum = sc.nextInt();

        int[][] matrix1 = new int[row][colum];
        int[][] matrix2 = new int[row][colum];

        int[][] sub = new int[row][colum];

        System.out.println("Enter elements of Matrix 1:");

        for(int i = 0;i < row; i++){
            for(int j = 0; j < colum; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix 2:");

        for(int i = 0;i < row; i++){
            for(int j= 0; j < colum;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("sub of Matrices:");


        for(int i = 0; i < row; i++){
            for(int j = 0; j <colum;j++){
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        printMatrix(sub);
        sc.close();

    } 

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
