package org.ReportIt;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ListOfComments {
    static ArrayList<Comments> comments = new ArrayList<Comments>();
    public static void addEmployee(String text, LocalDateTime date){
        comments.add(new Comments(text,date));
        System.out.println("Comment added !!!");
    }
    static  void store(){

    }
}
