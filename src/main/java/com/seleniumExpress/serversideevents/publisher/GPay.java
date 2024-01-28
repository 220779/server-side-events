package com.seleniumExpress.serversideevents.publisher;

import com.seleniumExpress.serversideevents.events.TransactionFailureEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GPay {

    @Autowired
    ApplicationEventPublisher publisher;

    public void sendMoney (String name, double amount, boolean condition){

        try {
            if (condition) {
                throw new RuntimeException(" Transaction failed...!");
            }
        System.out.println("Sending money to " + name);
        System.out.println(" , sending amount " + amount +" is successful");

        } catch (RuntimeException e) {
            publisher.publishEvent(new TransactionFailureEvent(name, amount));
            e.printStackTrace();
        }
    }
}
