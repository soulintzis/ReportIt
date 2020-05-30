package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;

//type of problems = streetLight, trafficLight, pothole, garbageCan, recyclingGarbageCan, waterLeakage
//danger degrees Low, Medium, High
//problem status in_progress, completed


public class Problem {
    private String location;
    private String type;
    private String  dangerDegree;
    private String description; //optional
    private LocalDate date_posted;
    private LocalTime time_posted;
    private String status;

    public Problem(String password, String phone, String telephone, String address, String loc, String type, String danger, String des){
        location = loc;
        this.type = type;
        dangerDegree = danger;
        description = des;
        description = des;
        status = "in_progress";
        date_posted = LocalDate.now();
        time_posted = LocalTime.now();
    }

    public void printObj(){
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Danger degree: " + dangerDegree);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date_posted);
        System.out.println("Time: " + time_posted);
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getDangerDegree() {
        return dangerDegree;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDate_posted() {
        return date_posted;
    }

    public LocalTime getTime_posted() {
        return time_posted;
    }
}
