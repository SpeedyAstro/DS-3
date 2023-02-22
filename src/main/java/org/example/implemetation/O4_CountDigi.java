package org.example.implemetation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class O4_CountDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int count = 0;
            while (n != 0) {
                n /= 10;
                count++;
            }
            System.out.println(count);
        }catch (ArithmeticException |InputMismatchException e){
            System.err.println("only numbers allowed !!");
        }
    }
}
