package com.bootcampexcercise.module2.activity;

public class Calculator {
    public static Object CALC_TYPE_BASIC;

    public Calculator(Object calcTypeBasic) {
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(x,y));
        System.out.println("Subtraction - " + subtract(x,y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x,y));
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    public static int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }
    public static int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }
    public static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            System.out.println("Dividing 0 with 0 is not possible");
        } else if (y == 0) {
            System.out.println("Division by 0 is not possible");
        } else {
            divValue = x / y;
        }
        return divValue;
    }

    public String getCalculatorType() {
        return null;
    }
}
