package com.example.randomjokes.Domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Value {

	@Expose
	private long id;
	@Expose
	private String joke;
	@Expose
	private List<Object> categories = new ArrayList<Object>();

	/**
	 * 
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	public Value withId(long id) {
		this.id = id;
		return this;
	}

	/**
	 * 
	 * @return The joke
	 */
	public String getJoke() {
		return joke;
	}

	/**
	 * 
	 * @param joke
	 *            The joke
	 */
	public void setJoke(String joke) {
		this.joke = joke;
	}

	public Value withJoke(String joke) {
		this.joke = joke;
		return this;
	}

	/**
	 * 
	 * @return The categories
	 */
	public List<Object> getCategories() {
		return categories;
	}

	/**
	 * 
	 * @param categories
	 *            The categories
	 */
	public void setCategories(List<Object> categories) {
		this.categories = categories;
	}

	public Value withCategories(List<Object> categories) {
		this.categories = categories;
		return this;
	}

}
