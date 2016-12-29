package cn.yijiao.sm.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class FilmListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if (event instanceof ContextStartedEvent) {
			System.out.println("Context Start");
		}else if (event instanceof ContextStoppedEvent) {
			System.out.println("Context stop");
		}
	}
}
