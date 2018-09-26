package com.mimimall.java.demo002;

import com.mimimall.demo.Dog;
/*
*  多态的存在有3个条件，1)要有继承
*  2)要有重写
*  3)父类引用指向子类对象:
*
* */

public class TaiDiDog extends Dog {


    //毛发
    private String hair;
    //外形
    private String look;
    //生产地
    private String birthPlace;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getLook() {
        return look;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }


    String walkStanding(){
        return "會直立行走";
    };

    void sing(){
        System.out.println("The dog like bones");
    };

    String bornLittleDog(){
        return "泰迪狗生的小狗很可爱";
    };
}
