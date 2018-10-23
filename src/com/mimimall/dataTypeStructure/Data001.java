package mimimall.dataTypeStructure;

public class Data001 {



    public static void main(String[] args) {
        String a ="monday";
        String b ="monday";

        String q =new String ("monday");

        System.out.println(differ(a,b));
        System.out.println("-----------我是分割线----------");
        System.out.println(differ2(a,b));
        System.out.println("-----------我是分割线----------");
        System.out.println(differ3(b,q));



    }



    static String differ(String e, String q){
        if (e == q){
            return "地址相同";
        }
        return "地址不相同";
    };



    static String differ2(String c ,String m){
        if (c.equals(m)){
            return "值相同";
        }
        return "值不相同";
    }

    static String differ3(String v ,String B){
        if (v==B){
            return "地址相同";
            }
        if(v.equals(B)){
            return "相同";
        }
        return "不同";

    }

}



