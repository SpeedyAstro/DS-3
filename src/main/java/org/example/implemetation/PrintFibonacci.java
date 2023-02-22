package org.example.implemetation;

public class PrintFibonacci {
    public static void main(String[] args) {
        int low = 0, high = 1;
        int fibo = 1;
        System.out.println(low);
        while (fibo<70){
            System.out.println(fibo);
            fibo = low + high;
            low = high;
            high = fibo;

        }
    }
}
