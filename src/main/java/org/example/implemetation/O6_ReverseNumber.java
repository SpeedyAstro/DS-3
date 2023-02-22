package org.example.implemetation;

import java.util.Scanner;

public class O6_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            System.out.println(n%10);
            n/=10;
        }
    }
}
