package org.example;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.println("Fibonacci Series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print( n1+" " +n2 );
        for ( int i = 2; i < n; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print( " " +n3);
        }
    }
}
