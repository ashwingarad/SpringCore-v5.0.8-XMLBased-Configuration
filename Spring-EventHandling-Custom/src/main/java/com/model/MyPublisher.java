/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author Ashwin
 *
 */
public class MyPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	/*
	 * @see org.springframework.context.ApplicationEventPublisherAware#
	 * setApplicationEventPublisher(org.springframework.context.
	 * ApplicationEventPublisher)
	 */
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void publish() {
		MyEvent event = new MyEvent(this);
		publisher.publishEvent(event);
	}

}
