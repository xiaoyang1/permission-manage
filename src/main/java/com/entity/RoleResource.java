package com.entity;

public class RoleResource {
    private int id;
    private int role_id;
    private int res_id;

    public RoleResource() {
    }

    public RoleResource(int role_id, int res_id) {
        this.role_id = role_id;
        this.res_id = res_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
                "id=" + id +
                ", role_id=" + role_id +
                ", res_id=" + res_id +
                '}';
    }
}
