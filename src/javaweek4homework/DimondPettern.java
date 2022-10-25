package javaweek4homework;

import java.util.Scanner;

// Write a program in Java to display the pattern like a diamond.
// While loop
public class DimondPettern {
    public static void main(String[] args) {
        int i, j, r;
        System.out.println("Input number of rows (half of the diamond) :");
        Scanner f = new Scanner(System.in);
        r = f.nextInt();
        for (i = 0; i <= r; i++)
            System.out.println("");
        for (j = 1; j <= 2 * i - 1; j++) ;
        System.out.println("*");
        System.out.println("\n");
    }

    {
        int j;
        int i = 0;
        int r = 0;
        for(j=1; j<=r-i; j++)
            System.out.print(" ");
        for(j=1;j<=2*i-1;j++)
            System.out.print("*");
        System.out.print("\n");
    }

}
