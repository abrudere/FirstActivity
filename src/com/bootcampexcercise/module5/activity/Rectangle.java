package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape{
    public double calculateArea() {
        return 2 * this.length * this.breadth;
    }

    public double calculatePerimeter() {
        return this.length * this.breadth;
    }
}
