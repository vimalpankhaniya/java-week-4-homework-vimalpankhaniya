package javaweek4homework;
// . Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17.... are the prime numbers.)
public class Programme12 {
    public static void main(String [] args){
        int num = 17;
        boolean flag = false;
        for (int i = 2; i<=num/2; ++i){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + "is a prime number");
        else
            System.out.println(num + "is not a prime number");
    }

}
