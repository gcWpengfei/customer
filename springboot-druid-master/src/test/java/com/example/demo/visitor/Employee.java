package com.example.demo.visitor;

import lombok.Getter;
import lombok.Setter;

public abstract class Employee {

    public static final int MALE = 0;
    public static final int FEMAIL = 1;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int salary;
    @Getter
    @Setter
    private int sex;

   public abstract void accept(IVisitor visitor);
}
