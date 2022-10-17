package com.itheima.DogTest;

public class Spi extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃骨头");
    }
}
