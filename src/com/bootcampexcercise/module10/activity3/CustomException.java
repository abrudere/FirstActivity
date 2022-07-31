package com.bootcampexcercise.module10.activity3;

public class CustomException extends Throwable {
    @Override
    public String getMessage() {
        return "One of the provided number is negative ";
    }
}
