package com.example.demo.observe;

import java.util.Observable;

public class Zhangsan extends Observable {

    public void haveBreakfast(){
        System.out.println("eat");
        super.setChanged();
        super.notifyObservers("hello world");
    }

    public void sleep(){
        System.out.println("sleep");
        super.setChanged();
        super.notifyObservers("good sleep");
    }
}
