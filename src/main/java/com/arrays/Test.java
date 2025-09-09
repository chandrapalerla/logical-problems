package com.arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("evenn number ::" + a[i]);
            } else {
                System.out.println("odd number ::" + a[i]);
            }
        }
    }
}
