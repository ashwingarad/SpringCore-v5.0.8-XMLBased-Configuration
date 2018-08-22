/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationListener;

/**
 * @author Ashwin
 *
 */
public class MyHandler implements ApplicationListener<MyEvent> {

	/*
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println(event.toString());
	}

}
