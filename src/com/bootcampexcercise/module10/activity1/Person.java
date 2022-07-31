package com.bootcampexcercise.module10.activity1;

public abstract class Person {
    public String name;
    public int age;

    void Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String david) {
        this.name = name;
    }
    public void setAge(int i) {
        this.age = age;
    }

    public abstract void introduce();

}
