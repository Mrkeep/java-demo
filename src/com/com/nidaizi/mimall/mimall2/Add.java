package com.nidaizi.mimall.mimall2;



public class Add {
    private Integer a ;
    private Integer b;
    private Integer c;

    //方法一
    int add001(Integer a){
        return a;
    };

    //方法二
    int add001(Integer a ,Integer b){
        return a-b;
    };

    //方法三
    int add001(Integer a,Integer b,Integer c){
        return a+b-c;
    };
    //字符串拼接
    String add001(String a,String b,String c){
        return a+b+c;
    };




}
