package com.xontel.testhiltjava.data.room.model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "weather")
public class WeatherDataDB {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String locationKey;
    private String cityName;
    private String region;
    private String country;
    private String cityNameAr;
    private String regionAr;
    private String countryAr;

    private Double tempC;
    private Double tempF;

    private String condition_text;

    private Double windKH;

    private Double precipMMAfter1;
    private Double precipMMPast1;

    private Integer humidity;

    private Double feelsLikeC;
    private Double feelsLikeF;

    private String sunRise;
    private String sunSet;

    private Double uv;
    private String uvText;

    private String hoursData;
    private String daysData;

    public WeatherDataDB(int id, String locationKey, String cityName, String region, String country, String cityNameAr, String regionAr, String countryAr, Double tempC, Double tempF, String condition_text, Double windKH, Double precipMMAfter1, Double precipMMPast1, Integer humidity, Double feelsLikeC, Double feelsLikeF,String sunRise,String sunSet, Double uv,String uvText, String hoursData, String daysData) {
        this.id = id;
        this.locationKey = locationKey;
        this.cityName = cityName;
        this.region = region;
        this.country = country;
        this.cityNameAr = cityNameAr;
        this.regionAr = regionAr;
        this.countryAr = countryAr;

        this.tempC = tempC;
        this.tempF = tempF;

        this.condition_text = condition_text;

        this.windKH = windKH;

        this.precipMMAfter1 = precipMMAfter1;
        this.precipMMPast1 = precipMMPast1;

        this.humidity = humidity;

        this.feelsLikeC = feelsLikeC;
        this.feelsLikeF = feelsLikeF;

        this.sunRise = sunRise;
        this.sunSet = sunSet;

        this.uv = uv;
        this.uvText = uvText;

        this.hoursData = hoursData;
        this.daysData = daysData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationKey() {
        return locationKey;
    }

    public void setLocationKey(String locationKey) {
        this.locationKey = locationKey;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityNameAr() {
        return cityNameAr;
    }

    public void setCityNameAr(String cityNameAr) {
        this.cityNameAr = cityNameAr;
    }

    public String getRegionAr() {
        return regionAr;
    }

    public void setRegionAr(String regionAr) {
        this.regionAr = regionAr;
    }

    public String getCountryAr() {
        return countryAr;
    }

    public void setCountryAr(String countryAr) {
        this.countryAr = countryAr;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public String getCondition_text() {
        return condition_text;
    }

    public void setCondition_text(String condition_text) {
        this.condition_text = condition_text;
    }


    public Double getWindKH() {
        return windKH;
    }

    public void setWindKH(Double windKH) {
        this.windKH = windKH;
    }

    public Double getPrecipMMAfter1() {
        return precipMMAfter1;
    }

    public void setPrecipMMAfter1(Double precipMMAfter1) {
        this.precipMMAfter1 = precipMMAfter1;
    }

    public Double getPrecipMMPast1() {
        return precipMMPast1;
    }

    public void setPrecipMMPast1(Double precipMMPast1) {
        this.precipMMPast1 = precipMMPast1;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(Double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public Double getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(Double feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public String getHoursData() {
        return hoursData;
    }

    public void setHoursData(String hoursData) {
        this.hoursData = hoursData;
    }

    public String getDaysData() {
        return daysData;
    }

    public void setDaysData(String daysData) {
        this.daysData = daysData;
    }

    public String getUvText() {
        return uvText;
    }

    public void setUvText(String uvText) {
        this.uvText = uvText;
    }

    public String getSunRise() {
        return sunRise;
    }

    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    @Override
    public String toString() {
        return "WeatherDataDB{" +
                "id=" + id +
                ", locationKey='" + locationKey + '\'' +
                ", cityName='" + cityName + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", cityNameAr='" + cityNameAr + '\'' +
                ", regionAr='" + regionAr + '\'' +
                ", countryAr='" + countryAr + '\'' +
                '}';
    }
}
