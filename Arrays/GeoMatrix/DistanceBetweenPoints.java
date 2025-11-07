package GeoMatrix;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first point (x1,y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter first point (x2,y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

       double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       System.out.println( "Distance between points : "+distance);


        sc.close();
    }
    
}
