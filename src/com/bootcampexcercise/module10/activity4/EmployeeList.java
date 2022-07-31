package com.bootcampexcercise.module10.activity4;

import com.bootcampexcercise.module10.activity2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        Employee e1 = new Employee("developer", "Accenture", 2000.00);
        Employee e2 = new Employee("QA", "FineTech", 3000.00);
        Employee e3 = new Employee("scrum master", "Intrum", 1500.00);
        Employee e4 = new Employee("lecturer", "Accenture", 1800.00);
        Employee e5 = new Employee("accountant", "Rimi", 2500.00);


        e1.setName("Agnes");
        e2.setName("Gustav");
        e3.setName("Mark");
        e4.setName("David");
        e5.setName("Lui");

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Employee emp = new Employee();

        System.out.println("The Employee whose salary is the highest is : " + emp.getHighestPaidEmp(empList));

    }
}
