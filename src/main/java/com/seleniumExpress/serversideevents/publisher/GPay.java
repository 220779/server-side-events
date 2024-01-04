package com.seleniumExpress.serversideevents.publisher;

import org.springframework.stereotype.Component;

@Component
public class GPay {

    public void sendMoney (String name, double amount){
        System.out.println("Sending money to " + name);
        System.out.println(" , sending amount " + amount +" is successful");

    }
}
