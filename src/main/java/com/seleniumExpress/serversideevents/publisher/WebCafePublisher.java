package com.seleniumExpress.serversideevents.publisher;

import com.seleniumExpress.serversideevents.listener.FirstListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebCafePublisher {

    @Autowired
     private FirstListener firstListener;

    public void streamRobot(String episodeNo){
        System.out.println("Web Cafe : Starting Robot" + episodeNo);

        firstListener.watchRobot(episodeNo);

    }
}
