package com.Hampus.scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //objects
        Scanner sc = new Scanner(System.in);
        Student benny = new Student();

        // game
        do {
            System.out.println("Input Benny's age");
            int result = sc.nextInt();

            benny.age = result;

            System.out.println("You picked " + result);
            System.out.println("Benny's age is: " + benny.age);
            break;
        } while (true);

    }
    }
