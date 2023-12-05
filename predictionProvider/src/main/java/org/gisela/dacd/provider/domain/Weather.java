package org.gisela.dacd.provider.domain;

import java.time.Instant;

// TODO: implementar dentro del Weather la nueva estructura del nuevo evento
public class Weather {
    private double humidity;
    private double temperature;
    private double precipitation;
    private double clouds;
    private double windSpeed;
    private Location location;
    private Instant predictionTime;

    public Weather(double humidity, double temperature, double precipitation, double clouds, double windSpeed, Location location, Instant predictionTime) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.clouds = clouds;
        this.windSpeed = windSpeed;
        this.location = location;
        this.predictionTime = predictionTime;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Instant getPredictionTime() {
        return predictionTime;
    }

    public void setPredictionTime(Instant predictionTime) {
        this.predictionTime = predictionTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
