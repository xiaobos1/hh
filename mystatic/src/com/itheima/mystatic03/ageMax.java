package com.itheima.mystatic03;

import java.util.ArrayList;

public class ageMax {
    private ageMax(){}

    public static int maxAge( ArrayList<Student> list){
        int max=list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int m=list.get(i).getAge();
            if(m>max){
                max=m;
            }
        }
        return max;
    }
}
