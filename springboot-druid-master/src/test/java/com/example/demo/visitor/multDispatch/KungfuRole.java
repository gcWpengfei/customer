package com.example.demo.visitor.multDispatch;

public class KungfuRole implements Role{

    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
