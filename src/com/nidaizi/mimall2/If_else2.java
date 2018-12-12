package com.nidaizi.mimall2;

public class If_else2 {
    public static void main(String[] args) {
        int a=90;
        if (a>=60){
            System.out.print("及格");
            if (a>=90){
                System.out.println("且优秀");
            }else {
                System.out.println("且中等");
            }
        }else {
            System.out.println("不及格");
        }
    }
}
