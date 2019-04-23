package com.megabyte;

public class Megabytes {
    public static void main (String [] args) {
        int Kilobytes = 2050;
        printMegabyte(Kilobytes);

    }
    public static void printMegabyte (int kilobyte) {
        int mb = kilobyte / 1024;
        int kb = kilobyte % 1024;

        System.out.println(kilobyte + "KB = " + mb + "mb and " + kb + "kb");
    }
}
