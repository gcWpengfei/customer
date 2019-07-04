package com.example.demo.visitor.multDispatch;

public class Client {

    public static void main(String[] args) {
        AbsActor oldActor = new OldActor();
        Role kungfuRole = new KungfuRole();
        kungfuRole.accept(oldActor);
    }
}
