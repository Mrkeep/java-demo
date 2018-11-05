package com.dataType;


import java.math.BigDecimal;

public class SimpleExample001 {
    //声明在方法中
    public static void main(String[] args) {

        SimpleExample001 simpleExample001 = new SimpleExample001();
        Integer h = simpleExample001.add();
        System.out.println(h);
    }
    //声明在方法中,作用域在此方法中,调用完,即销毁.
    Integer add (){
        Integer a =6;
        return a*9;
    };


}
