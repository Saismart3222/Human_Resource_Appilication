package com.hrapp;

//import jdk.internal.org.jline.terminal.TerminalBuilder;

//import javax.swing.plaf.DesktopPaneUI;

public class HRApp {

    public static void main(String[] args) {
	// write your code here
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "Sai", 403200);
        Employee e2 = new Employee(231,"Saismart", 700000);

        Department dept = new Department("Education");
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(231, "JohncenaSai",1800000));

        Employee[] emps = dept.getEmployees();
        for (Employee emp: emps){
            System.out.println("Emp "+emp);
        }
        System.out.println("Total "+dept.getTotalSalary());
        System.out.println("Average "+dept.getAverageSalary());
        System.out.println("EMP "+dept.getEmployeeByID(230));
    }
}
