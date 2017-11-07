package com.entity;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private Date created_day;
    private int isdeleted;
    private Date finalExcuteTime;

    public User() {
    }

    public User(String name, Date finalExcuteTime) {
        this.name = name;
        this.finalExcuteTime = finalExcuteTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_day() {
        return created_day;
    }

    public void setCreatedDay(Date created_day) {
        this.created_day = created_day;
    }

    public int getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(int isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getFinalExcuteTime() {
        return finalExcuteTime;
    }

    public void setFinalExcuteTime(Date finalExcuteTime) {
        this.finalExcuteTime = finalExcuteTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdDay=" + created_day +
                ", isdeleted=" + isdeleted +
                ", finalExcuteTime=" + finalExcuteTime +
                '}';
    }
}
