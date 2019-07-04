package com.example.demo.visitor.multDispatch;


public class OldActor extends AbsActor {
    @Override
    public void act(KungfuRole role) {
        System.out.println("年纪大了，演不动了");
    }
}
