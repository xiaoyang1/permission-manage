package com.entity;

public class Role {
    private int permission_value;
    private String description;

    public Role() {
    }

    public Role(int permission_value, String description) {
        this.permission_value = permission_value;
        this.description = description;
    }

    public int getPermission_value() {
        return permission_value;
    }

    public void setPermission_value(int permission_value) {
        this.permission_value = permission_value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "permission_value=" + permission_value +
                ", description='" + description + '\'' +
                '}';
    }
}
