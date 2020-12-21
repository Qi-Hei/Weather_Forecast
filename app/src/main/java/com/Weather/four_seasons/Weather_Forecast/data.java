package com.Weather.four_seasons.Weather_Forecast;

import java.util.List;

public  class data {
    private String shidu;
    private String pm25;
    private String pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private  yesterday yesterday;
    private List<forecast> Forecast;

    public void setYesterday(yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public yesterday getYesterday() {
        return yesterday;
    }

    public void setForecast(List<forecast> forecast) {
        Forecast = forecast;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getShidu() {
        return shidu;
    }

    public String getPm25() {
        return pm25;
    }

    public String getQuality() {
        return quality;
    }

    public String getGanmao() {
        return ganmao;
    }

    public String getPm10() {
        return pm10;
    }

    public String getWendu() {
        return wendu;
    }

    public List<forecast> getForecast() {
        return Forecast;
    }
}