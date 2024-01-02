package com.seleniumExpress.serversideevents.events;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class TheRobotEvents  {

    private String episodeNo;

    public TheRobotEvents( String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }
}

