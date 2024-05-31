package com.clientapi.enums;

public enum ClientStatus {

    ACTIVE("A", "Active"),
    DELETED("D", "Deleted");

    private String code;
    private String description;

    ClientStatus(String code, String description){
        this.code= code;
        this.description = description;
    }


}
