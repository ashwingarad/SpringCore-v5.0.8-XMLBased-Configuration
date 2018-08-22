/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationEvent;

/**
 * @author Ashwin
 *
 */
public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "My Custom Event";
	}

}
