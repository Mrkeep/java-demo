package com.mimimall.java.demo002;

public class NewBornDog extends TaiDiDog{
    private String littleName;
    private Integer age;
    private String tail;

    public String getLittleName() {
        return littleName;
    }

    public void setLittleName(String littleName) {
        this.littleName = littleName;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    //小狗会哭
    void cry(){
        System.out.println("The little dog will cry");
    };

    String bornLittleDog(){
        return "泰迪狗生的小狗很可爱";
    };
}
