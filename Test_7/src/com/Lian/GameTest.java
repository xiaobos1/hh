package com.Lian;

public class GameTest {
    public static void main(String[] args) {
        //创建俩个角色
        Role r1=new Role("乔峰",100);
        Role r2=new Role("蔡徐坤",100);

        //开始战斗
        while(true){
            r1.attack(r2);
            //判断r2的血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"KO"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"KO"+r1.getName());
                break;
            }
        }
    }
}
