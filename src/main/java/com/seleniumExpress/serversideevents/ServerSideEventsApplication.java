package com.seleniumExpress.serversideevents;

import com.seleniumExpress.serversideevents.config.AppConfig;
import com.seleniumExpress.serversideevents.publisher.WebCafePublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ServerSideEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSideEventsApplication.class, args);
	}

	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	WebCafePublisher bean = context.getBean("webCafePublisher", WebCafePublisher.class);


}
