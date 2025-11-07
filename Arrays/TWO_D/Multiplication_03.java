package TWO_D;

import java.util.Scanner;

public class Multiplication_03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of matrix :");
        int rows = sc.nextInt();
        System.out.println("Enter number of matrix :");
        int colums = sc.nextInt();
        int[][] matrix1 = new int[rows][colums];
        int[][] matrix2 = new int[rows][colums];
        int[][] multi =  new int[rows][colums];

        System.out.println("Enter element of matrix 1 :");

        for(int i = 0; i < rows; i++){
            for(int j = 0 ; j < colums; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of matrix 2 :");

        for(int i = 0 ; i < rows; i++ ){
            for(int j =0; j < colums; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplecation of matrix :");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                multi[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        sc.close();
        printMulti(multi);

    }

    public static void printMulti(int[][] matrix){
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element +" ");
            }
            System.out.println();
        }
    }
    
}
