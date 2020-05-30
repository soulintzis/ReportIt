package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comment {
    private String text;
    private LocalDate date;
    private LocalTime time;

    public Comment(String text) {
       this.text= text;
       this.time = LocalTime.now();
       this.date = LocalDate.now();
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

    public void printComment(){
        System.out.println("Text: " + text);
    }
}
