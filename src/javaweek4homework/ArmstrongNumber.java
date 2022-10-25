package javaweek4homework;
// Write a program to input any number and check if it Armstrong number or not
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//where:
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//So:
//1+125+27=153
public class ArmstrongNumber {
    public static void main (String [] args ){

    int number = 153, originalNumber, remainder, result = 0, n=0;

    originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

    originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
    {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, n);
    }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
                System.out.println(number + " is not an Armstrong number.");


}}




