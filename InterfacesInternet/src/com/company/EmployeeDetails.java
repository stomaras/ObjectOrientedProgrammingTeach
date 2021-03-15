package com.company;

public abstract class EmployeeDetails {

    private String name;
    private int emp_ID;

    public void commonEmpDetails() {
        System.out.println("Name"+name);
        System.out.println("emp_ID"+emp_ID);
    }


    public abstract void confidentialDetails(int s, String p);













}
