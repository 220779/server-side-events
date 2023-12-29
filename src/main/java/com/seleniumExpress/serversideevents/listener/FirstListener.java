package com.seleniumExpress.serversideevents.listener;

import org.springframework.stereotype.Component;

@Component
public class FirstListener {

    public void watchRobot(String episodeNo){

        System.out.println("First listener : Start watching Robot");
        System.out.println("First listener : Playing Robot" + episodeNo);
    }
}
