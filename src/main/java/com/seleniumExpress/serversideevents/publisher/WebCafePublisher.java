package com.seleniumExpress.serversideevents.publisher;

import com.seleniumExpress.serversideevents.events.MonthyPhytonEvent;
import com.seleniumExpress.serversideevents.events.TheRobotEvents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class WebCafePublisher  {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void streamRobot(String episodeNo){
        System.out.println("Web Cafe : Starting Robot" + episodeNo);
        applicationEventPublisher.publishEvent(new TheRobotEvents( episodeNo));
    }

    public void streamMonthyPhyton(String epNo){
        System.out.println("Web Cafe : Starting Monthy Phyton" + epNo);
        applicationEventPublisher.publishEvent(new MonthyPhytonEvent(epNo));
    }

}
