package mimimall.demo;

public class Demo003 {


    public static void main(String[] args) {
        //创建对象:三只小狗[对象 是类的实例]
        Dog yellow = new Dog();
        //第二只小狗
        Dog black = new Dog();
        //第三只小狗
        Dog white = new Dog();

        yellow.setName("小黄");
        yellow.setAge(3);
        yellow.setColor("黄色");

        black.setName("小黑");
        black.setAge(3);
        black.setColor("黑色");

        white.setName("小白");
        white.setAge(3);
        white.setColor("白色");


        System.out.println("我的第1只小狗是"+yellow.getName()+"，颜色是："+yellow.getColor()+"，今年"+yellow.getAge()+"岁了");
        yellow.barking();
        yellow.running();
        yellow.jumping();

        System.out.println("---------我是分界线---------"+"\n");
        System.out.println("我的第2只小狗是"+black.getName()+"，颜色是："+black.getColor()+"，今年"+yellow.getAge()+"岁了");

        black.barking();
        black.running();
        black.jumping();

        System.out.println("---------我是分界线---------"+"\n");
        System.out.println("我的第3只小狗是"+white.getName()+"，颜色是："+white.getColor()+"，今年"+white.getAge()+"岁了");
        white.barking();
        white.running();
        white.jumping();



    }

}
