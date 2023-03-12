package org.example.implemetation;

import java.util.Scanner;

public class O11_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(max<=b) max = b;
        if (max<=c) max = c;
        if (max==a) System.out.println((b*b + c*c)==a*a );
        else if (max==b) System.out.println((c*c+a*a)==b*b );
        else System.out.println((b*b + a*a)==c*c);
    }
}
