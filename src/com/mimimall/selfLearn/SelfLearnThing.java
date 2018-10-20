package mimimall.selfLearn;

public class SelfLearnThing {
    //StringBuffer is better than String sometimes
    public static void main(String[] args) {
        StringBuffer an =new StringBuffer("start");
        StringBuffer QQ = an.append("a").insert(2,"J");
        System.out.println(QQ);
        System.out.println(an.substring(3));
        System.out.println(an.substring(3,4));
    }
}
