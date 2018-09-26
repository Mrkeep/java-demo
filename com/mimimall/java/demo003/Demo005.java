package com.mimimall.java.demo003;

public class Demo005 {
    public static void main(String[] args) {
        Real real = new Real();
        real.setAge(5);
        real.setHobby("打网球");


        System.out.println(real.getAge()+"\n");
        System.out.println(real.getName()+"\n");

        real.cook();
    }
}
