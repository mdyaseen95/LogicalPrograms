package org.example;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Perfectness");
        int n = sc.nextInt();
        for ( int i = 1; i <= n/2; i++ ){
            if ( n % i == 0){
                sum += i;
            }
        }
        if ( sum == n )
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
