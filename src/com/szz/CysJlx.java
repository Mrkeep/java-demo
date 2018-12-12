package com.szz;

public class CysJlx {
    /**
     * 数值型：整型：byte  short  int  long  浮点型： float  double
     * 非数值型：char String  boolean
     *
     */
   public  int ja(int a,int b) {
        int c = a + b;
        return c;
    }
    public  int ja(int a,int b,int c) {
        int d = a + b + c;
        return d;
    }
    public  int jian(int a,int b) {
        int c = a - b;
        return c;
    }
    public  int cheng(int a,int b) {
        int c = a * b;
        return c;
    }
    public  int chu(int a,int b) {
        int c = a / b;
        return c;
    }
   public static  void main(String[] args){
          byte age=127;//8位
          System.out.println(age);
          System.out.println(Byte.MAX_VALUE);
          System.out.println(Byte.MIN_VALUE);
          int i=129;//3位
          System.out.println(Integer.MAX_VALUE);
          System.out.println(Integer.toString(i));
          float f=1.0f;//单精度32位
          double d=456.23;//双精度64位
          long l=456l;//64位
          short s=589;//16位
          char c='1';
          boolean b=true;
          System.out.println(b);
          //自动转化
          char sex='女';
          String name="dd";
          System.out.println(sex+name);
          String S2=name+sex;

          int i1=10;
          double d1=2.33;
          double d2=i1+d1;

          //强制转化
          double d3=3.56;
          int i4=(int)d3;

/**
 整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。

 转换从低级到高级。
 低  ------------------------------------>  高
 byte,short,char—> int —> long—> float —> double
 数据类型转换必须满足如下规则：
 1. 不能对boolean类型进行类型转换。
 2. 不能把对象类型转换成不相关类的对象。
 3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
 4. 转换过程中可能导致溢出或损失精度
 * */
            short s4=1;
            char c7;
            c7=(char)s4;

        CysJlx one=new CysJlx();
        int a1=one.ja(100,200);
        int a2=one.ja(4,5,6);
        int a3=one.jian(1,2);
        int a4=one.cheng(4,5);
        int a5=one.chu(4,2);
        System.out.println("a+b="+a1);
        System.out.println("a+b+c="+a2);
        System.out.println("a-b="+a3);
        System.out.println("a*b="+a4);
        System.out.println("a/b="+a5);
        //求模%
        //System.out.println("a/b="+4%2);
        String ss="abcdD";
       // System.out.println(String.);
    }
}
