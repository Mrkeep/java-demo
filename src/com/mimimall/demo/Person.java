package mimimall.demo;

public class Person {

    private String name;
    private int age;
    private Enum gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }
    void run(){
        System.out.println("pao");
    };
}
