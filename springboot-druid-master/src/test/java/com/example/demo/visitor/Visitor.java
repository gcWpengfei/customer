package com.example.demo.visitor;

public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee employee) {
        System.out.println(this.getCommonEmployeeInfo(employee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getCommonInfo(Employee employee){
        String info = "name: "+employee.getName() +"\n"
                + "salary: "+employee.getSalary() +"\n"
                + "sex: "+employee.getSex() +"\n";

        return info;
    }

    private String getCommonEmployeeInfo(CommonEmployee employee){
        return this.getCommonInfo(employee) + employee.getJob();
    }

    private String getManagerInfo(Manager manager){
        return this.getCommonInfo(manager) + manager.getPerformance();
    }
}
