package com.example.randomjokes;

/*
 * Generic callback interface.
 */
public interface AppCallback <T>{
	void done(T retObj,Exception e);
}
