package org.example.implemetation;

import java.util.Scanner;

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