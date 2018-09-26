package com.mimimall.java.demo002;

import com.mimimall.demo.Dog;

public class Demo002 {

    public static void main(String[] args) {

        TaiDiDog taiDiDog = new TaiDiDog();
        taiDiDog.setName("泰迪狗");
        taiDiDog.setColor("好看色");
        taiDiDog.setBirthPlace("國外");
        taiDiDog.setAge(4);
        taiDiDog.getBoy();

        System.out.println("泰迪狗"+taiDiDog.walkStanding()+"\n");
        System.out.println("------我是分割線-----"+"\n");
        System.out.println("名字:"+taiDiDog.getName()+",顏色:"+ taiDiDog.getColor()+",生產地:"+taiDiDog.getBirthPlace()+"\n");
        System.out.println("我家狗的名字是:"+taiDiDog.getBoy());
        Dog dog = new TaiDiDog();
        System.out.println("------我是分割線-----"+"\n");
        dog.setName("京東");
        //重写父类的方法
        ((TaiDiDog) dog).sing();


        //小狗
        Dog dog1 = new NewBornDog();
        //类型转换
        ((NewBornDog) dog1).sing();
        ((NewBornDog) dog1).cry();
        String a = ((NewBornDog) dog1).bornLittleDog();
        System.out.println(a);




        //由于继承有用父类的方法
        NewBornDog newBornDog = new NewBornDog();
        newBornDog.sing();
    }
}
