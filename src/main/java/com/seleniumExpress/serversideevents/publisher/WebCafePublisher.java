package com.seleniumExpress.serversideevents.publisher;

import org.springframework.stereotype.Component;

@Component
public class WebCafePublisher {

    public void streamRobot(String episodeNo){
        System.out.println("Web Cafe : Starting Robot" + episodeNo);
        System.out.println("");

    }
}
