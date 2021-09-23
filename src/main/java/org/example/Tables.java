package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Tables
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for multiples");
        int n = sc.nextInt();
        for ( int i = 1; i <= 10 ; i++){
            int product = i * n;
            System.out.println(n + "*" + i + "=" +product);
        }
    }
}
