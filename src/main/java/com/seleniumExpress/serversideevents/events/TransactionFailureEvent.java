package com.seleniumExpress.serversideevents.events;

public class TransactionFailureEvent {

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionFailureEvent(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String name;
    public double amount;

}
