package com.seleniumExpress.serversideevents.listener;

import com.seleniumExpress.serversideevents.events.MonthyPhytonEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FifthListener {

    public void watchMonthyPhyton(String epNo){

        System.out.println("Fifth listener : Start watching Monthy Phyton");
        System.out.println("Fifth listener : Playing Monthy Phyton" + epNo);
    }
    @EventListener
    public void onApplicationEvent(MonthyPhytonEvent event) {
        watchMonthyPhyton(event.getEpisodeNo());
    }
}
