package com.example.randomjokes;

import com.squareup.otto.Bus;

import android.app.Application;

public class MyApplication extends Application {

	private Bus bus;

	public Bus getBus() {
		if (bus == null)
			bus = new Bus();
		return bus;
	}

}
