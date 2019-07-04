package com.example.demo.observe;

import org.junit.Test;

public class Client {
    @Test
    public void name() throws Exception {
        Zhangsan zhangsan = new Zhangsan();
        Lisi lisi = new Lisi();
        zhangsan.addObserver(lisi);

        zhangsan.haveBreakfast();
        zhangsan.sleep();
    }
}
