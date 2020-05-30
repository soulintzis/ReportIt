package org.ReportIt;

import java.time.LocalDateTime;

public class Comments {
    private String text;
    private LocalDateTime date;



    public Comments(String text, LocalDateTime date) {
       this.text= this.text;
       this.date= this.date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime_date() {
        return date;
    }

    public void setTime_date(LocalDateTime time_date) {
        this.date = time_date;
    }
    static void addComment(){

    }
}
