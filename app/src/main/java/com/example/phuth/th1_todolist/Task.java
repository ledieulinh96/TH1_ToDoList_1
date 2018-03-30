package com.example.phuth.th1_todolist;

/**
 * Created by phuth on 3/30/2018.
 */

public class Task {

    // 3 em kia dich lai cung dc
    private String name;
    private String hour;
    private String day;
    private int img;

    public Task(String name, String hour, String day, int img) {
        this.name = name;
        this.hour = hour;
        this.day = day;
        this.img = img;
    }

    public Task(String name, String hour, String day) {
        this.name = name;
        this.hour = hour;
        this.day = day;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
