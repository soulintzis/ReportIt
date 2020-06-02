package org.ReportIt;

import java.time.LocalDateTime;

public class Vote {
    private boolean vote; //downvote->false upvote->true
    private LocalDateTime date_time;

    public Vote(boolean vote) {
        this.vote = vote;
        date_time = LocalDateTime.now();
    }

    public boolean getVote() {
        return vote;
    }

    public void printVote(){

    }
}
