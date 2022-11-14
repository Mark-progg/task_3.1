package org.example;

public class Main {
    public static void main(String[] args) {
        forFib(11);
        System.out.println();
        whileFib(11);
    }

    public static void forFib(int n){
        int firstFib = 1;
        int secondFib = 1;
        int nextFib;

        System.out.print(firstFib + " " + secondFib + " ");

        for(int i = 3; i <= n; i++){
            nextFib = firstFib + secondFib;

            System.out.print(nextFib + " ");

            firstFib = secondFib;
            secondFib = nextFib;
        }
    }

    public static void whileFib(int n){
        int firstFib = 1;
        int secondFib = 1;
        int nextFib;

        System.out.print(firstFib + " " + secondFib + " ");

        int i = 3;

        while (i <= n){
            nextFib = firstFib + secondFib;

            System.out.print(nextFib + " ");

            firstFib = secondFib;
            secondFib = nextFib;
            i++;
        }
    }
}