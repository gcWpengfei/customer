package com.example.demo.visitor;

import lombok.Getter;
import lombok.Setter;

public class Manager extends Employee {

    @Getter
    @Setter
    private String performance;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
