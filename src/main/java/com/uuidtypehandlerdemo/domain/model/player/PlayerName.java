package com.uuidtypehandlerdemo.domain.model.player;

public class PlayerName {
    String value;

    @Deprecated
    PlayerName(){}

    public PlayerName(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "PlayerName{" +
                "value='" + value + '\'' +
                '}';
    }
}
