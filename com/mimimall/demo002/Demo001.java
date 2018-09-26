package com.mimimall.demo002;

public class Demo001 {
    public static void main(String[] args) {

        Add add = new Add();

        Integer a = add.add001(2);
        Integer b = add.add001(3,6);

        Integer c = add.add001(2,2,5);
        String d= add.add001("You\n","Are\n","a Nice Guy");
        System.out.println(a);
        System.out.println("-----分界线----\n");

        System.out.println(b);
        System.out.println("-----分界线----\n");

        System.out.println(c);
        System.out.println("-----分界线----\n");

        System.out.println(d);
    }
}
