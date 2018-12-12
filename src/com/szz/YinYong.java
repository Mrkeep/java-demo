package com.szz;

import java.util.Arrays;

public class YinYong {
/**
 *引用数据类型:
 *
 * 类 接口 数组 枚举 标注
 * 1.引用数据类型的使用与定义基本数据类型变量不同，引用数据类型的变量定义以及赋值有一个固定的格式。
 * 2.格式：数据类型 变量名 = new 数据类型();
 * 3.调用该类型实例的功能时：变量名.方法名();
 * 使用步骤：
 * 1.创建对象实例 Scanner sc = new Scanner(System.in);
 * 2.调用方法：
 * int i = sc.nextInt();
 * String s = sc.next();
 */
    byte age;
    char sex;
    String name;
    float score;
    String xkm;
    public void chengJi(String name, float score,String xkm){
        System.out.println("姓名="+ name+" 科目="+xkm+" 分数="+score);
    }
    public static void main(String[] args){
        YinYong yy=new YinYong();
        yy.chengJi("小明",89.9f,"数学");
//        CysJlx one=new CysJlx();
//        int a1=one.ja(1,2);
//        int a2=one.ja(4,5,6);
//        int a3=one.jian(1,2);
//        int a4=one.cheng(4,5);
//        int a5=one.chu(4,2);
//        System.out.println("a+b="+a1);
//        System.out.println("a+b+c="+a2);
//        System.out.println("a-b="+a3);
//        System.out.println("a*b="+a4);
//        System.out.println("a/b="+a5);
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        for(int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.print('\n');

        }

        int[] arr=new int[3];
        arr[1]=1;
        arr[0]=2;
        String s= Arrays.toString(arr);
        Arrays.sort(arr);
        System.out.println(arr[2]);
        System.out.println(s);

        String s2=new String("1234561");
        String s3=s2.replace('1','a');
        System.out.println(s3);

    }
}
