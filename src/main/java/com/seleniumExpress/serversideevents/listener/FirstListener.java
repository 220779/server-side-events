package com.seleniumExpress.serversideevents.listener;

import com.seleniumExpress.serversideevents.events.TheRobotEvents;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FirstListener {

    public void watchRobot(String episodeNo){

        System.out.println("First listener : Start watching Robot");
        System.out.println("First listener : Playing Robot" + episodeNo);
    }
    @EventListener
    public void onApplicationEvent(TheRobotEvents event) {
        watchRobot(event.getEpisodeNo());
    }
}

