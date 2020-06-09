package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;

public class EmployeeSession {
    private LocalTime login_hour;
    private LocalDate login_date;
    private Employee emp;

    public EmployeeSession(Employee employee) {
        this.emp = employee;
        this.login_hour = LocalTime.now();
        this.login_date = LocalDate.now();
    }

    public void printEmployeeSession(){
        System.out.println("---------------Session---------------\n");
        System.out.println("Username: " + emp.getUsername());
        System.out.println("Loged in at: " + this.login_hour + this.login_date);
        System.out.println("---------------Session End-----------\n");
    }

    public boolean checkForTimeout(){
//        check if one hour has past from the login
        return false;
    }
}
