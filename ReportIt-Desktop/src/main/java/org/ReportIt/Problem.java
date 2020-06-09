package org.ReportIt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Problem {
    private ArrayList<Comment> comments = new ArrayList<Comment>();

    private String location;
    private String type;
    private String  dangerDegree;
    private String description; //optional
    private LocalDate date_posted;
    private LocalTime time_posted;
    private String status;
    private String posted_from;

    public Problem(String loc, String type, String danger, String des, Citizen user){
        this.posted_from = user.getUsername();
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
        System.out.println("----------------<<Problem>>---------------");
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Danger degree: " + dangerDegree);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date_posted);
        System.out.println("Time: " + time_posted);
        System.out.println("Posted from: " + posted_from);
        System.out.println("---------------<Problem End>--------------");
    }

    public Comment addComment(String text, String usr){
        comments.add(new Comment(text, usr));
        System.out.println("Comment added successfully");
        int last_item_pos = comments.size() - 1;
        Comment Comment = comments.get(last_item_pos);
        return Comment;
    }

    public void printComments(){
        for(Comment str: comments){
            str.printComment();
        }
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
    public String getUsername() {
        return posted_from;
    }
    public LocalDate getDate_posted() {
        return date_posted;
    }

    public LocalTime getTime_posted() {
        return time_posted;
    }
}
