package com.dataType.dataType2;
/*
* 作用域
*
* */
public class Example008 {
    public static void main(String[] args) {
        double a = 0.23;
        if (a==0.23){
            int k = 6;   //k的作用域在这个if中
            System.out.println(a+2+k);
        }
//        System.out.println(k);  //此处引用k,由于超出了作用域,这样写会报错.
        System.out.println(a);  //此处引用a变量,则不会报错,a为全局变量.
    }
}
