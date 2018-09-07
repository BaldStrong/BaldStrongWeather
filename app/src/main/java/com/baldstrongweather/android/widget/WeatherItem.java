package com.baldstrongweather.android.widget;

public class WeatherItem {

	private String x;
	private String info;
	private float y;

/*
	public WeatherItem(String x, String  info, float y) {
		this.x = x;
		this.info = info;
		this.y = y;
	}
*/
	public WeatherItem(String x, float y) {
		this.x = x;
		this.y = y;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}
