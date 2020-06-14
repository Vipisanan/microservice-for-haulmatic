package com.example.microserviceforhaulmatic.utils;

public enum RoleTypes {
    D("DRIVER"),
    A("ASSISTANT");
    private String value;

    RoleTypes(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
