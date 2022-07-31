package com.bootcampexcercise.module10.activity3;

public class Calculator {

    public double add(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public double add(double x, double y, double z) {
        double sum = x + y + z;
        return sum;
    }

    public double subtract(double x, double y) {
        double diff = 0;
        diff = (x>y) ? (x-y) : (y-x);
        return diff;
    }

    public double multiply(double[] numbers) {
        double num = 1;
        try {
            boolean isNumNegative = false;
            for (int i = 0; i < numbers.length; i++) {
                num = num * numbers[i];
                if(numbers[i] < 0)
                    isNumNegative = true;
            }
            if(isNumNegative)
                throw new CustomException();

        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return num;
    }

    public double divide(double x, double y) {
        int result = 0;
        try {
            if (x == 0 || y == 0) {
                throw new ArithmeticException();
            } else {
                result = (int) (x / y);
            }
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Input value must not be equal to 0");
        } finally {
            System.out.println("Thank you for using the calculator.");
        }
        return result;
    }

}
