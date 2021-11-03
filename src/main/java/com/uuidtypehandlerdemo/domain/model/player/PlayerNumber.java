package com.uuidtypehandlerdemo.domain.model.player;

import java.util.UUID;

public class PlayerNumber {
    UUID value;

    @Deprecated
    public PlayerNumber() {
    }

    private PlayerNumber(UUID value) {
        this.value = value;
    }

    public static PlayerNumber from(UUID source) {
        return new PlayerNumber(source);
    }

    public UUID value() {
        return value;
    }

    public static PlayerNumber generate() {
        return new PlayerNumber(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "PlayerNumber{" +
                "value=" + value +
                '}';
    }
}
