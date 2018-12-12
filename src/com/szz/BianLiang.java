package com.szz;

public class BianLiang {
    /**
     * 什么是变量？
     * 变量就是一个容器，用来存放数据的
     * 变量的三要素
     * 数据类型：决定变量空间大小
     * 变量名称：数据存放地址的别名，方便计算机找到该变量
     * 变量的值：存储的数
     *
     * 声明变量并赋值
     * 数据类型  变量名称=变量的值
     * 举例： int a=1;
     * int a;
     * a=1;
     *命名规则：首字一般位字母，_，$，其余为字母，数字，_，$
     * 举例a1,_b,$c,ab_12等，不可用命名规则以外的名字以及关键词，例如：1ab int public
     *变量名一般简短且清楚的表明变量的作用，首字母一般小写，其后的单词首字母一般大写; myName
     *
     * 变量先声明并赋值后，才可以使用，否则报错
     * */
    public static void main(String[] args){

        //不使用变量，打印2个1后再打印2个2
        System.out.println(1);
        System.out.println(1);
        //System.out.println(2);
        //System.out.println(2);
        //使用变量，打印2个1后再打印2个2

        int i=1;
        System.out.println(i);
        System.out.println(i);
        int myAge=2;
        int i1=1;
        System.out.println(myAge);

        double c=46;
        double m=c;
        System.out.println(m);
        double num=c/7;
        System.out.println(num);

    }

}
