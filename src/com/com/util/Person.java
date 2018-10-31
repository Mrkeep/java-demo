package com.util;
/*
*   定义person实体类
* */
public class Person {
    private String name;
    private int age;
    private int inch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
    void banZuan(){
        System.out.println("搬砖");
    };
}
