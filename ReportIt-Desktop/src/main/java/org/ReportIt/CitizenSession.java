package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitizenSession {
    private LocalTime login_hour;
    private LocalDate login_date;
    private Citizen citizen;

    public CitizenSession(Citizen citizen) {
        this.citizen = citizen;
        this.login_hour = LocalTime.now();
        this.login_date = LocalDate.now();
    }

    public void printCitizenSession(){
        System.out.println("----------------<<Session>>---------------");
        System.out.println("Username: " + citizen.getUsername());
        System.out.println("Loged in at: " + this.login_hour + this.login_date);
        System.out.println("---------------<Session End>--------------");
    }

    public boolean checkForTimeout(){
//        check if one hour has past from the login
        return true;
    }
}
