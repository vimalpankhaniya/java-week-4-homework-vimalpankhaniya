package javaweek4homework;
// . Display left angle triangle of * using nested for loops
public class LeftAngleDiomand {
    public static void main(String [] args){
        int row =5;
        for (int i =1; i<=row; i++){
            for (int j = 1; j <= row - i; j++) {
                System.out.println("");
        }
            for (int k =1; k <=i; k++){
                System.out.println("*");
            }
            System.out.println("");
    }
}}
