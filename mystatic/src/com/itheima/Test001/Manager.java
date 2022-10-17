package com.itheima.Test001;

public class Manager extends Empolyee{
    private double bouns;

    public Manager(){
    }
    public Manager(String id,String name,double salary,double bouns){
        super(id,name,salary);
        this.bouns=bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    @Override
    public void work() {
        System.out.println("管理别人");
    }
}
