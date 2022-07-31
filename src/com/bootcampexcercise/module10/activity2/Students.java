package com.bootcampexcercise.module10.activity2;

import com.bootcampexcercise.module10.activity1.Person;

public class Students extends Person {
    private String schoolName;

//    void Students() {
//        this.schoolName = "Unknown";
//    }
//
//    Students(String schoolName) {
//        this.schoolName = schoolName;
//    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {
        System.out.println("I study in  " +  schoolName);
    }
}
