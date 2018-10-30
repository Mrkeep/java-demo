package com.dataType;

import java.util.ArrayList;
import java.util.List;
public class SimpleExample002 {
    //声明在语句块中
    public static void main(String[] args) {

        SimpleExample002 simpleExample002 = new SimpleExample002();
        List<Integer>myNumber = simpleExample002.result(8);
        for(Integer a : myNumber){
            System.out.println(a);
        }
    }


    List<Integer>number=new ArrayList<>();
    List<Integer> result(Integer k){
        for(int i=0;i<6;i++){
            //声明在语句块中
            int d=k++;
            number.add(d);
        }
        return number;
    };
}
