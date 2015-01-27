package com.example.randomjokes.Domain;

import com.google.gson.annotations.Expose;

public class Joke {

	@Expose
	private String type;
	@Expose
	private Value value;

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public Joke withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 * @return The value
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            The value
	 */
	public void setValue(Value value) {
		this.value = value;
	}

	public Joke withValue(Value value) {
		this.value = value;
		return this;
	}

}
