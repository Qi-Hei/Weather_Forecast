package com.Weather.four_seasons.Weather_Forecast;

public class App {
    private String time;
    private String date;
    private String message;
    private String status;
    private data data;
    private forecast forecast;
    private static CityInfo CityInfo;

    //增加内容

    public void setCityInfo(CityInfo cityInfo) {
        CityInfo = cityInfo;
    }

    public void setForecast(forecast forecast) {
        this.forecast = forecast;
    }


    public forecast getForecast() {
        return forecast;
    }


    public CityInfo getCityInfo() {
        return CityInfo;
    }

    public void setData(data data) {
        this.data = data;
    }

    public data getData() {
        return data;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}