package com.seleniumExpress.serversideevents.listener;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;


@Component
public class ApplicationContextRefreshedListener {


 @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {

        System.out.println("Application initialized or refreshed...");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStartedEvent (ContextStartedEvent event) {
        System.out.println("Application initialized with start...");
        System.out.println(event);
    }


    @EventListener
    public void handleContextStoppedEvent (ContextStoppedEvent event){
        System.out.println("Application stopped with stop...");
        System.out.println(event);
    }

    @EventListener
    public void handleContextClosedEvent (ContextClosedEvent event){
        System.out.println("Application closed with closed...");
        System.out.println(event);
    }
}
