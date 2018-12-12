package com.nidaizi.mimall.demo003.demo004;

import java.util.UUID;

public class Example {

    public static void main(String[] args) {
        //Java实例:加减运算4
        Integer c;
        Integer a = addNum(8,9);
        Integer b = addNum(8,8);
        System.out.println(addNum(9,90));
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        //生成随机数实例
        System.out.println("随机数:"+random(9.00));

        //生成UUID实例
        String myUUID = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println("我的UUID实例:"+myUUID);

    }








    static Double random(Double f){
        Double aDouble = Math.random();
        return f*aDouble;
    };







    static Integer addNum(Integer a,Integer b){
        if (a != b) {
            return a+b;
        }else if (a<b){
            return a*b;
        }else if(a>b){
            return a/b;
        }
        return a-b;
    };
}
