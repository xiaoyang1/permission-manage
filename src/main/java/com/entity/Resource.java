package com.entity;

public class Resource {
    private int id;
    private String url;
    private String name;

    public Resource() {
    }

    public Resource(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
