package com.dataType;

import com.util.AllInUse;

/*
*   展示作用域:方法内,调用完后,即销毁;不在写执行方法了
*
* */
public class SimpleExample005 {



    //a的作用域在此方法内
    Integer add(){
        int a ;
        //初始化赋值后
        a = 12;
//        return a+9; //不对,不能直接引用.因为只是申明变量了,并没有初始化,报错,
        return a+0;
    };


    //因为超出了a的作用域所以在这个方法内不能调用到小a;
    Integer addNum(){
        int b;
        b = 13;
//        return b + a; //因为超出了a的作用域在引用,就报错了;
        return b;
    };
}
