package com.example.demo.observe;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        boolean flag = o.hasChanged();
        System.out.println(flag);
        System.out.printf("update:"+arg.toString());
        System.out.println("");
        System.out.printf("");
    }
}
