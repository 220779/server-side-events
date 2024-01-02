package com.seleniumExpress.serversideevents;

import com.seleniumExpress.serversideevents.config.AppConfig;
import com.seleniumExpress.serversideevents.publisher.WebCafePublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class ServerSideEventsApplication {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	WebCafePublisher bean = context.getBean("webCafePublisher", WebCafePublisher.class);
	bean.streamRobot("EP: - 004");
	}
}
