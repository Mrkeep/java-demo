package com.dataType.yujukuai;

public class SimpleExample003 {
    //声明在语句块中
    public static void main(String[] args) {
        SimpleExample003 simpleExample003 = new SimpleExample003();
        Integer a = simpleExample003.number();
        System.out.println(a);
    }


    Integer number(){
        int a= 5 ;
        int b = 4;
        if (a < b){
            //生命在语句块中
            int q;
            q = 6;
            return q;
        };
        return a;
    };

}
