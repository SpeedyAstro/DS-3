package org.example.implemetation;

import java.util.Scanner;

public class O9_GCDnLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int org1 = num1;
        int org2 = num2;
        int rem = 1,div = num2,dvd = num1;
        if (num1<num2) {
            div = num1;
            dvd = num2;
        }
        // obtaining GCD
        while (rem!=0){
            rem = dvd%div;
            dvd = div;
            div = rem;
        }
        // GCD = dvd
        int gcd = dvd;
        System.out.println("GCD - "+gcd);
        // LCM = num1 * num2 / GCD;
        System.out.println("LCM - "+(org1*org2)/gcd);
    }
}
