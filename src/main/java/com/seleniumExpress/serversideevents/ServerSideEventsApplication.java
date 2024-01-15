package com.seleniumExpress.serversideevents;

import com.seleniumExpress.serversideevents.config.AppConfig;
import com.seleniumExpress.serversideevents.publisher.GPay;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ServerSideEventsApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.start();

		GPay bean = context.getBean("GPay", GPay.class);
		bean.sendMoney("Getter Setter", 500, true);

		context.stop();
		context.close();

	}
}

