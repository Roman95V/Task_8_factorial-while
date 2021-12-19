package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int _number = number;
        int factorial = 1;

        while (number > 0) {
            factorial = factorial * number;
            number--;
        }
        System.out.println("Factorial with: " + _number + "! = " + factorial);
    }
}
