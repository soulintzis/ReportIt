package org.ReportIt;
import java.util.ArrayList;

public class ListOfComments {
    static ArrayList<Comment> comments = new ArrayList<Comment>();

    public static Comment addComment(String text){
        comments.add(new Comment(text));
        System.out.println("Comment added successfully");
        int last_item_pos = comments.size() - 1;
        Comment Comment = comments.get(last_item_pos);
        return Comment;
    }
    static  void store(){

    }

    public static void printCitizens(){
        for(Comment str: comments){
            str.printComment();
        }
    }
}
