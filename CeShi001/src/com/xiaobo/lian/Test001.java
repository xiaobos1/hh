package com.xiaobo.lian;

import java.util.Date;
import java.util.Random;

public class Test001 {
    public static void main(String[] args) {
//        String str="12345566";
//        char[] ch=new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i]=str.charAt(i);
//            System.out.println(ch[i]);
//            Date d2=new Date(1000);
//            System.out.println(d2);

        //}
        Random r=new Random();
        Date d1=new Date(Math.abs(r.nextInt()));
        Date d2=new Date(Math.abs(r.nextInt()));

        long time1=d1.getTime();
        long time2=d2.getTime();
        if(time1 > time2){
            System.out.println("第一个在后");
        }else{
            System.out.println("第一个在前");
        }
    }

    private static void extracted() {
        Date d1=new Date(0L);

        long time=d1.getTime();

        time=time+1000L*60*60*24*365;

        d1.setTime(time);

        System.out.println(d1);
    }
}
