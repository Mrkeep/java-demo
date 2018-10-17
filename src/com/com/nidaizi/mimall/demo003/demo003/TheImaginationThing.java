package com.nidaizi.mimall.demo003.demo003;

public abstract class  TheImaginationThing {
    //我是抽象类
    private String name;
    private int age;
    private Enum gender;
    private String hobby;


    //抽象方法
    void dance(){
        System.out.println("我会Ican dance");

    }


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

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
