package com.example.javamireaprac14.model;

public class PostOffice {

    public PostOffice() {

    }

    public PostOffice(String name, String cityName) {
        this.name = name;
        this.cityName = cityName;
    }

    private String name;
    private String cityName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
