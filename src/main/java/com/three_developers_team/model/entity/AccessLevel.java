package com.three_developers_team.model.entity;

public enum  AccessLevel {

    USER(0),
    ADMIN(1);

    private Integer accessLevel;

    AccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }
}
