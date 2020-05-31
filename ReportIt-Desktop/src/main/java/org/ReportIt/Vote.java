package org.ReportIt;

import java.time.LocalDateTime;

public class Vote {
    private boolean vote;
    private LocalDateTime dataTime;

    public Vote(boolean vote) {
        this.vote = vote;
        this.dataTime = LocalDateTime.now();
    }
}
