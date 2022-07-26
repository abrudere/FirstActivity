package com.bootcampexcercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        } while ((i++) < 100);

    }
}
