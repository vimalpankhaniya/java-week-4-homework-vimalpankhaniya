package javaweek4homework;

import java.util.Scanner;

// Display right angle triangle of @ using nested for loops
// @
// @@
// @@@
// @@@@
// @@@@@
public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Right Angled Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Star Pattern");

        int i;
        for (i = 1; i <= rows; i++) {
        }
        for (int j = 1; j <= i; j++) {
        }
        System.out.println("@");
        System.out.println();
    }
}
