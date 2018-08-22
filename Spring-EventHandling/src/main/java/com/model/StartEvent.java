/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author Ashwin
 *
 */
public class StartEvent implements ApplicationListener<ContextStartedEvent> {

	/*
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Application Context Started : " + event.getTimestamp());
		System.out.println("Source : " + event.getSource());

		ApplicationContext applicationContext = event.getApplicationContext();
		DemoBean bean = applicationContext.getBean("demo", DemoBean.class);
		System.out.println("\nNew Bean from StartEvent : " + bean.getStr());
	}

}
