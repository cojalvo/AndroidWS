package com.example.randomjokes;

import com.example.randomjokes.Domain.Joke;

import retrofit.http.GET;
import retrofit.Callback;

public interface RandomJokesService {
	@GET("/jokes/random")
	public void getJoke(Callback<Joke> joke);
	

}
