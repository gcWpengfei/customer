package com.example.demo.visitor.dispatch;

public class YoungActor extends AbsActor {
    @Override
    public void act(KungfuRole role) {
        System.out.println("年轻人演功夫角色");
    }
}
