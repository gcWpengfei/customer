package com.example.demo.visitor.dispatch;

import org.junit.Test;

public class TestClass {

    @Test
    public void test1() throws Exception {

        AbsActor oldActor = new OldActor();
        Role kungfuRole = new KungfuRole();

        oldActor.act(kungfuRole);
        oldActor.act(new KungfuRole());
    }
}
