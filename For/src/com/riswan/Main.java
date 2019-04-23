package com.riswan;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 dengan bunga 2% " + hitungBunga(10000.0, 2.0));
        System.out.println("10.000 dengan bunga 3% " + hitungBunga(10000.0, 3.0));
        System.out.println("10.000 dengan bunga 4% " + hitungBunga(10000.0, 4.0));
        System.out.println("10.000 dengan bunga 5% " + hitungBunga(10000.0, 5.0));
        System.out.println("===================================");

        for (int i = 2; i <  9; i++) {
            System.out.println("10.000 dengan bunga " + i +"% " + hitungBunga(10000.0, i));
        }

        System.out.println("===================================");


        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 dengan bunga " + i +"% " + hitungBunga(10000.0, i));
        }
        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number "+ i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }


    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }
        for (int i =  2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double hitungBunga (double jumlah, double rataBunga) {
        return (jumlah * (rataBunga / 100));
    }
}
