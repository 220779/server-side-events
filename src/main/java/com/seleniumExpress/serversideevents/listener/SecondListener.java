package com.seleniumExpress.serversideevents.listener;

import com.seleniumExpress.serversideevents.events.TheRobotEvents;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class SecondListener  {
    public void watchRobot(String episodeNo) {

        System.out.println("Second listener : Start watching Robot");
        System.out.println("Second" +
                " listener : Playing Robot" + episodeNo);
    }
    @EventListener
    public void onApplicationEvent(TheRobotEvents event) {
        watchRobot(event.getEpisodeNo());
    }
}
