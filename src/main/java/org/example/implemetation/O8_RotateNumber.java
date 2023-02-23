package org.example.implemetation;

import java.util.Scanner;

public class O8_RotateNumber {
    public static void main(String[] args) {
        // Rotate a number , changing last element to first for single rotation
        // number of rotation
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int r = sc.nextInt();
        //
        int length = getLength(number);
        r %= length;
        System.out.println(r);
        if (r<0) r = length+r;
        System.out.println(r);
        while (r--!=0){
            int div = number%10;
            number/=10;
            number += div*(int) Math.pow(10,length-1);
        }
        System.out.println(number);
    }
    static int getLength(int num){
        int length = 0;
        while (num!=0){
            num /= 10;
            length++;
        }
        return length;
    }
}
