package com.dataType;

import com.util.AllInUse;

import java.util.Scanner;

public class SimpleExample004 extends AllInUse {
    //全局变量a 没有初始化;默认值为null;大括号内皆可引用;
    String a ;
    static String q = "程序退出";

    public static void main(String[] args) {
        SimpleExample004 simpleExample004 = new SimpleExample004();
        String myTest = simpleExample004.name();
        System.out.println(myTest);
        //匿名内部类
        System.out.println(new SimpleExample004().travel());
        StringBuffer o = new SimpleExample004().like();
        //继承AllInUse类--内部类使用--获取常量值
        System.out.println(new SimpleExample004().like().append(new AllInUse().getApp_Key()));
        System.out.println("---------我是分界线-----------");
        //
        ab();

    }


    //两个方法内使用
    String name (){
        return a+"我是不能用的";
    };
    String travel (){
        return 1+a;
    };


    //全局变量在语句块中使用
    StringBuffer d = new StringBuffer("我是拼接成的笑脸:");
    StringBuffer like(){
        StringBuffer q = d.append(a).append("*").append(".").append("*").append(a);
        return q;
    };
    //思考?为什么不能引用String a;
    static Boolean ab (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        while (true){
            String nextLine = scanner.nextLine();
            if (nextLine.equals("exit")){
                System.out.println(q);
                //System.out.println(a); //引用a报错
            }
        }
    };
}
