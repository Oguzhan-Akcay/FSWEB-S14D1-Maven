package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        setSalary(getSalary() + 700);
        System.out.println("Mid Developer "+ getName() + " working in senior position. New Salary: " + getSalary());
    }
}
