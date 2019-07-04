package com.example.demo.visitor;

public interface IVisitor {
    void visit(CommonEmployee employee);

    void visit(Manager manager);
}
