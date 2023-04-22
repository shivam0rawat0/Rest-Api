package org.example.model;

public class DataPoint {
    String location;
    Float temperature;
    Float pressure;
    Float humidity;

    public DataPoint(String location, Float temperature, Float pressure, Float humidity) {
        this.location = location;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "DataPoint{" +
                "location='" + location + '\'' +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
