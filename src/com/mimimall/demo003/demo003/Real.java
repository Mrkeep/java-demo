package mimimall.demo003.demo003;

public class Real extends TheImaginationThing{
        private final String name="我是Final修饰的,因此我的名字不能改";

        private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    void cook(){
        System.out.println("我会做饭");
    };

}