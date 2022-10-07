package com.Lian;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyFace={"风流倜傥","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlFace={"美轮美奂","沉鱼落雁","闭月羞花","亭亭玉立","身材姣好","相貌平平","面目狰狞"};

    //空参
    public Role(){

    }
    //含参数
    public Role(String name,int blood,char gender,String face){
        this.name=name;
        this.blood=blood;
        this.gender=gender;
        this.face=face;
    }
    //face
    public void setFace(String face){
        //随机性格
        if(gender == '男'){
            Random r=new Random();
            int ret= r.nextInt(boyFace.length);
        }else if(gender == '女'){
            
        }else{
            this.face="面目狰狞";
        }
        this.face=face;
    }
    public String getFace(){
        return face;
    }
    //gender
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    //name
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    //blood
    public void setBlood(int blood){
        this.blood=blood;
    }
    public int getBlood(){
        return blood;
    }

    //攻击的方法
    public void attack(Role role){
        //计算造成的伤害
        Random r=new Random();
        int hurt=r.nextInt(20)+1;

        //修改挨揍的血量
        int remainBlood=role.getBlood()-hurt;
        //对剩余血量判断
        remainBlood=remainBlood<0?0:remainBlood;
        //修改挨揍人的血量
        role.setBlood(remainBlood);
        //this攻击调用者
        System.out.println(this.getName()+"攻击了"+role.name+"一下"+
                "造成了"+hurt+"的伤害"+role.getName()+",蔡徐坤还剩下"+remainBlood+"血");
    }

}
