package com.company;

public class HR extends EmployeeDetails{
    private int salary;
    private String performance;

    @Override
    public void confidentialDetails(int s, String p) {
        this.salary = s;
        this.performance = p;
        System.out.println("Salary is == " + salary);
        System.out.println("Performance is == " + performance);
    }
}
