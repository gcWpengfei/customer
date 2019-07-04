package com.example.demo.visitor;

import lombok.Getter;
import lombok.Setter;

public class CommonEmployee extends Employee {

    @Getter
    @Setter
    private String job;


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
