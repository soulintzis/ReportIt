package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comment {
    private String text;
    private LocalDate date;
    private LocalTime time;
    private String username;


    public Comment(String text, String username) {
       this.text= text;
       this.time = LocalTime.now();
       this.date = LocalDate.now();
       this.username = username;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getUsername(){
        return username;
    }

    public void printComment(){
        System.out.println("Text: " + text);
        System.out.println("Username: " + username);
    }
}
