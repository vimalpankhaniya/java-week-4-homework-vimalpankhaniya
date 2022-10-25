package javaweek4homework;
// -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        double max = 0;
        double min = 0;

        System.out.println("Enter ten floating point: /n");

        for (int x = 0; x < 10; x++) {
            a = scan.nextDouble();

            if (x == 0) {
                min = a;
                max = a;
            } else if (a < min) {
                min = a;
            } else if (a > max) {
                max = a;
            }
            System.out.println("Minimum value: " +min);
            System.out.println("Maximum value: " + max);
        }
        scan.close();
    }}
