package com.seleniumExpress.serversideevents.listener;


import com.seleniumExpress.serversideevents.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(2)
@Component
public class SendEmailListener {

    @EventListener
    public void start (TransactionFailureEvent event){
        System.out.println("Sending email! ");
        System.out.println("Hi! " + event.getName() +
                "Transaction failed for the amount " + event.getAmount());

    }

}
