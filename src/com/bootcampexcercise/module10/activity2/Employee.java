package com.bootcampexcercise.module10.activity2;

import com.bootcampexcercise.module10.activity1.Person;

import java.awt.*;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    public Employee(String jobTitle, String company, double salary){
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }


    public String getJobTitle() {
        return jobTitle;
    }
    public String getCompany() {
        return company;
    }
    public double getSalary() {
        return salary;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println("I work as a " + jobTitle + " in " + company + " and my salary is " + salary + " euros.");
    }

    public double getHighestPaidEmp(List<Employee> empList) {
        double largest = 0;
        for(int i = 0; i < empList.size(); i++) {
            if(empList.get(i).getSalary() > largest) {
                largest = empList.get(i).getSalary();
            }
        }
        return largest;
    }

}

