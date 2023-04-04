package com.example.javamireaprac15.model;

import jakarta.persistence.*;

@Entity
@Table(name = "departure")
public class Departure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    private String type;
    @Column(name = "departure_date")
    private String departureDate;

    public Departure() {
    }

    public Departure(String type, String departureDate) {
        this.type = type;
        this.departureDate = departureDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}
