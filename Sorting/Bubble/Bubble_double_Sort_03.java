package Sorting.Bubble;

import java.util.Scanner;

public class Bubble_double_Sort_03 {

    public static void DoubleBubble(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            } 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        DoubleBubble(arr);

        System.out.println("Sorted array :");
        for (double num : arr) {
            System.out.print(num + ", ");
        }

        sc.close();

    }

}
