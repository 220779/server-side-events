package com.seleniumExpress.serversideevents.listener;


import com.seleniumExpress.serversideevents.events.MonthyPhytonEvent;
import com.seleniumExpress.serversideevents.events.TheRobotEvents;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener {


    //Multiple events
    /*@EventListener(classes = {MonthyPhytonEvent.class, TheRobotEvents.class})
    public void start() {
    }*/

    //Multiple listeners
    @EventListener
        public void start1 (MonthyPhytonEvent event){
        System.out.println("start1");
    }

    @EventListener
    public void start2 (TheRobotEvents event){
        System.out.println("start2");
    }
}
