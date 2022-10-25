package javaweek4homework;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FiboNumber {
    public static int fibo(int n){
        if (n <=1)
            return n;
        return fibo(n-1) + (n-2);
    }
    public static void main(String [] args){
        int N =10;
        for (int i =0; i< N; i++){
            System.out.println(fibo(i) + "" );
        }
    }
}
