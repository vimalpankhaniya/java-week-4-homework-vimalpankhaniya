package javaweek4homework;

import java.util.Scanner;

public class VowelCo {
    public static void main (String[]args ){
        char ch;
        System.out.println("Enter any chararacter of Alphabet");
        Scanner v = new Scanner(System.in);

        ch = v.next().charAt(0);

        if (ch =='a' || ch =='e' || ch =='i' || ch == 'o'
        || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch =='U'){

            System.out.println("Vowel");
        } else
            System.out.println("Consontant");
    }
}
