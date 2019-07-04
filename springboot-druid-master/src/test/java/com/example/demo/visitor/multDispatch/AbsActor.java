package com.example.demo.visitor.multDispatch;



public abstract class AbsActor {

    public void act(Role role){
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungfuRole role){
        System.out.println("演员可以扮演功夫角色");
    }
}
