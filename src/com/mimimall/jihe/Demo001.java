package mimimall.jihe;


import java.util.ArrayList;
import java.util.List;

public class Demo001 {


    //创建集合--类型String
    public static void main(String[] args) {
        List<String>nameList = new ArrayList<>();
        nameList.add("小明");
        nameList.add("晓东");

        for (String a :nameList){
            if (nameList.size()>0){
                System.out.println(a);
            }
        }
    }


}
