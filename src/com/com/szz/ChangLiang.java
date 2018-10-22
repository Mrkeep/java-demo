package com.szz;

public class ChangLiang {
    //**常量在程序运行时是不能被修改的。
    //在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：
    final double PI = 3.1415927;
    //虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量*/
//    byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。
//    当使用常量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制, 例如：

    int decimal = 100;
    int octal = 0144;
    int hexa =  0x64;

//    字符串常量和字符常量都可以包含任何Unicode字符。例如：
    char a = '\u0001';
    String b = "\u0001";
}
