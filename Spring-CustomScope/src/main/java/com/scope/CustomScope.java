package com.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * @author Ashwin
 */
public class CustomScope implements Scope {

	private final ThreadLocal<Object> myThreadScope = new ThreadLocal<Object>() {
		protected Map<String, Object> initialValue() {
			System.out.println("initialize ThreadLocal");
			return new HashMap<String, Object>();
		}
	};

	private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
		System.out.println("getting object from scope.");
		Object object = scope.get(name);
		if (object == null) {
			object = objectFactory.getObject();
			scope.put(name, object);
		}
		return object;
	}

	@Override
	public Object remove(String name) {
		System.out.println("removing object from scope.");
		
		Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
		destructionCallbacks.remove(name);
		return scope.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		destructionCallbacks.put(name, callback);
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		return "CustomScope";
	}

}
