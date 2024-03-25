package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        setSalary(getSalary() + 500);
        System.out.println("Junior Developer "+ getName() + " working in senior position. New Salary: " + getSalary());
    }
}
