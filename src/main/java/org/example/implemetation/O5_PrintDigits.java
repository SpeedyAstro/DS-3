package org.example.implemetation;

import java.util.Scanner;

public class O5_PrintDigits {
    public static void main(String[] args) {
        // prints digits of given number
        // > length of number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int length = getLength(number);
        while (length!=0){
            int div = (int) Math.pow(10,--length);
            System.out.println(number/div);
            number %= div;
        }

    }
    static int getLength(int number){
        int counter = 0;
        while (number!=0){
            number/=10;
            counter++;
        }
        return counter;
    }
}
