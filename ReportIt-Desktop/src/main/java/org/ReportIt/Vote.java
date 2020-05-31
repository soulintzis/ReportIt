package org.ReportIt;

<<<<<<< HEAD
import java.time.LocalDateTime;

public class Vote {
    private boolean vote;
    private LocalDateTime dataTime;

    public Vote(boolean vote) {
        this.vote = vote;
        this.dataTime = LocalDateTime.now();
=======
import java.util.ArrayList;

public class Vote {
    private boolean vote; //downvote->0 upvote->1
    private static int counter=0;

    public Vote(boolean vote) {
        this.vote = vote;
        getNumOfInstances();
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    public boolean getVote() {
        return vote;
    }

    public static int getNumOfInstances() {
        counter++;
        return counter;
    }

    ArrayList<Vote> votes_list = new ArrayList<Vote>();
        for(int i=0; i<=getNumOfInstances(); i++) {
        System.out.println(votes);
>>>>>>> 3b4ebb293af0751b90b8348272d5629661bf73ad
    }
}
