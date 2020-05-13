package com.example.inclass13;

import java.util.List;

public class Locations {
    List<Location> points;
    String title;

    public Locations(List<Location> points, String title) {
        this.points = points;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "points=" + points +
                ", title='" + title + '\'' +
                '}';
    }
}
