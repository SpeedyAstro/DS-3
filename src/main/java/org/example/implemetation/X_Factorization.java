package org.example.implemetation;

import java.util.Scanner;

public class X_Factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int div=2 ;div*div<n; div++){
            if (n%div==0){
                n /= div;
                System.out.print(div+" ");
            }
        }
        if (n!=1)   // not dividable number
            System.out.println(n);
    }
}
