package org.example;

import java.util.Scanner;

public class PrimeNumber {
    static void prime( int n ){
        int i, flag = 0;
        for ( i = 2; i <= n/2 ; i++){
            if ( n % i == 0){
                flag = 1;
                break;
            }
        }

        if ( flag == 0)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Not prime");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Prime");
        int n = sc.nextInt();
        prime(n);
    }
}
