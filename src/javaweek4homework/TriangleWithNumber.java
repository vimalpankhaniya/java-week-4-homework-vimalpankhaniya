package javaweek4homework;
/* . Write a program in Java to display the pattern like a triangle with a number.
 For eg. Input number of rows: 10 Expected Output:
 */

import java.util.Scanner;

public class TriangleWithNumber {
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("Enter number of rows : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.println("");
            }
            scanner.close();
        }
    }


}
