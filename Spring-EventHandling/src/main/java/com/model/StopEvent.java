/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author Ashwin
 *
 */
public class StopEvent implements ApplicationListener<ContextStoppedEvent> {

	/*
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("\nApplication Context Stopped event : " + event.getTimestamp());
		System.out.println("Source : " + event.getSource());

		ApplicationContext applicationContext = event.getApplicationContext();
		boolean f = applicationContext.containsBean("demo");
		System.out.println("\nDemo Bean is contained : " + f);
		System.out.println("Is singleton : " + applicationContext.isSingleton("demo"));
		System.out.println("Type of bean : " + applicationContext.getType("demo"));
	}

}
