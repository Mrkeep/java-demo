package com.dataType.dataType2;

public class SimpleExample007 {
    //作用域引起的问题,看下面的问题


    public static void main(String[] args) {


        //静态代码块
        {
            String name = "big";
            System.out.println(name);
        };
        String name ="我叫北";



        //下面的会报错,为什么???
        String oldKing = "北";
        {
//            String oldKing = "北";
            System.out.println(oldKing);
        };

        //原因:因为oldKing的作用域还没有结束

    }






}
