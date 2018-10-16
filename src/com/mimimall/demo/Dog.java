package mimimall.demo;

public class Dog {
    /*
    *  定义dog类
    *
    * */

    private String name;
    private Integer age;
    private String color;
    private final String Boy = "David";

    public String getBoy() {
        return Boy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //会叫
    String barking(){
        return "會叫";
    };
    //会跑
    String running(){
        return "會跑";
    };

    //会跳
    String jumping(){
        return "會跳";
    };
    void sing(){
        System.out.println("The dog likes singing!");
    };


}
