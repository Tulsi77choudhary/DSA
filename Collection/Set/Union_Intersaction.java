package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Union_Intersaction {

    static void union(int[] set1, int[] set2){
        Set<Integer> unionSet = new LinkedHashSet<>();

        for(int num : set1){
            unionSet.add(num);
        }
        for(int num : set2){
            unionSet.add(num);
        }

        System.out.println("Union: " );
        for(int num : unionSet){
            System.out.print(num + " ");
        
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first set: ");
        int n = sc.nextInt();
        int[] set1 = new int[n];
        System.out.print("Enter the elements of first set: ");
        for (int i = 0; i < n; i++) {
            set1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second set: ");
        int m = sc.nextInt();
        int[] set2 = new int[m];
        System.out.print("Enter the elements of second set: ");
        for (int i = 0; i < m; i++) {
            set2[i] = sc.nextInt();
        }
    
        union(set1, set2);
      
    }
    
}
