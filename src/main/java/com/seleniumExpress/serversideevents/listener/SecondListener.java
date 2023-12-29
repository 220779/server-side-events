package com.seleniumExpress.serversideevents.listener;

import org.springframework.stereotype.Component;


@Component
public class SecondListener {
    public void watchRobot(String episodeNo) {

        System.out.println("Second listener : Start watching Robot");
        System.out.println("Second" +
                " listener : Playing Robot" + episodeNo);
    }
}
