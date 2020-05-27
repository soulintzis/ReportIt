package org.ReportIt;

import java.time.LocalDateTime;

//type of problems = streetLight, trafficLight, pothole, garbageCan, recyclingGarbageCan, waterLeakage
//danger degrees Low, Medium, High
//problem status in_progress, completed


public class Problem {
    private String location;
    private String type;
    private String  dangerDegree;
    private String description; //optional
    private LocalDateTime time_date;
    private String status;

    public Problem(String loc, String type, String danger, String des){
        location = loc;
        this.type = type;
        dangerDegree = danger;
        description = des;
        description = des;
        status = "in_progress";
        time_date = LocalDateTime.now();
    }

    public void printObj(){
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Danger degree: " + dangerDegree);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Date: " + time_date);
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

    public LocalDateTime getTime_date() {
        return time_date;
    }

    public String getStatus() {
        return status;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDangerDegree(String dangerDegree) {
        this.dangerDegree = dangerDegree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime_date(LocalDateTime time_date) {
        this.time_date = time_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
