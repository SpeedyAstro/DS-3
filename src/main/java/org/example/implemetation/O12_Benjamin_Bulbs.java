package org.example.implemetation;

import java.util.Scanner;

public class O12_Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i*i<=n;i++) System.out.println(i*i);
    }
}
