package com.amisitysu.gmail;


public class Sum {
    public static void main(String[] args) {

        int Sum = 0;

        for (int s = 1; s <= 6; s++) {
            Sum += s;
            System.out.println(s + ") Num is " + s + ", sum is " + Sum);
        }

        System.out.println("  --------------------  ");
        System.out.println("Sum of numbers is " + Sum);
    }
}