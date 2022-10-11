package com.String1;

public class StringTest3 {
    public static void main(String[] args) {
        //身份信息获取
        String id="430381202210102246";
        //出身年
        String year=id.substring(6,10);
        //月
        String moon=id.substring(10,12);
        //日
        String day=id.substring(12,14);


        System.out.println(year+"年"+moon+"月"+day+"日");
        //男女判断
        char people=id.charAt(16);
        int num=people-48;
        if(num%2==1){
            System.out.println("性别为：男");
        }else{
            System.out.println("性别为：女");
        }

    }
}
