package com.dataType;

public class SimpleExample004 {
    //全局变量a 没有初始化;默认值为null;大括号内皆可引用;
    String a ;


    public static void main(String[] args) {
        SimpleExample004 simpleExample004 = new SimpleExample004();
        String myTest = simpleExample004.name();
        System.out.println(myTest);
        //匿名内部类
        System.out.println(new SimpleExample004().travel());
        StringBuffer o = new SimpleExample004().like();
        System.out.println(new SimpleExample004().like());

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
}
