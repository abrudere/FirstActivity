package com.bootcampexcercise.module10.activity2;

public class AbstractActivity {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Students student = new Students();

        employee.setName("David");
        employee.setAge(33);

        employee.setJobTitle("developer");
        employee.setCompany("Accenture");
        employee.setSalary(2000.00);
        employee.introduce();

        student.setSchoolName("University of Latvia");
        student.introduce();
    }
}
