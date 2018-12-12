package com.szz;

public class Buer {
    public boolean bb(int a,int b) {
        if (a >= b)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
        //boolean类型只有true 和false 两个值，一般和关系运算符结合这用
        //>  <  = = !=  >= <=
        int a=2;
        int b=3;
        boolean c=a<b;
        System.out.println(c);

        Buer be=new Buer();
        boolean bl=be.bb(1,3);
        System.out.println(bl);
    }
}
