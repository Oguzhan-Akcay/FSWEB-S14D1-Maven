package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        setSalary(getSalary() + 1000);
        System.out.println("Senior Developer "+ getName() + " working in senior position. New Salary: " + getSalary());
    }


}
