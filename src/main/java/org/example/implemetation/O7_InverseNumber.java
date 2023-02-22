package org.example.implemetation;

import java.util.Scanner;
// index value start from end (index start from 1 not 0)
// last digit from number is index and last index is 1 that's value
public class O7_InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0,counter =1;
        while (n!=0){
            int pos = n%10;
            n /= 10;
            number += counter++ * (int)Math.pow(10,pos-1);
        }
        System.out.println(number);
    }
}