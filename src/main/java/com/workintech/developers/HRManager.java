package com.workintech.developers;

public class HRManager extends Employee{

    private SeniorDeveloper[] seniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private JuniorDeveloper[] juniorDevelopers;
    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        setSalary(getSalary() + 50);
        System.out.println("HRManager "+ getName() + " working in senior position. New Salary: " + getSalary());
    }

    public void addEmployee(SeniorDeveloper employeeSenior){
        for (int i = 0; i <= seniorDevelopers.length; i++){
            if (seniorDevelopers[i] == null){
                seniorDevelopers[i] = employeeSenior;
            }else {
                System.out.println("İndexs is full.");
            }
        }
    }

    public void addEmployee(MidDeveloper employeeMid){
        for (int i = 0; i <= midDevelopers.length; i++){
            if (midDevelopers[i] == null){
                midDevelopers[i] = employeeMid;
            }else {
                System.out.println("İndexs is full.");
            }
        }

    }

    public void addEmployee(JuniorDeveloper employeeJunior){
        for (int i = 0; i <= juniorDevelopers.length; i++){
            if (juniorDevelopers[i] == null){
                juniorDevelopers[i] = employeeJunior;
            }else {
                System.out.println("İndexs is full.");
            }
        }
    }
}
