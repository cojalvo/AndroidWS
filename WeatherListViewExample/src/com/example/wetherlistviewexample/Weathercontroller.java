package com.example.wetherlistviewexample;

import java.util.ArrayList;
import java.util.List;

public class Weathercontroller  implements IWeatherController
{
	private IDataAcces dao;
	Weathercontroller()
	{
		descriptionList = new ArrayList<String>();
		descriptionList.add("Hard snow");
		descriptionList.add("Rainy day");
		descriptionList.add("Cloudy day");
		descriptionList.add("Sunny day");
		dao = DAO.getInstance();
	}
	private List<String> descriptionList;

	public List<WeatherItem> GetWeather() {
		return dao.GetWeather();
	}
}
