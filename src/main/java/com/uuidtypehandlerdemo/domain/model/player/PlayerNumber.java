package com.uuidtypehandlerdemo.domain.model.player;

import java.util.UUID;

import javax.validation.constraints.NotNull;

public class PlayerNumber {
    @NotNull(message = "UUIDv4を入力してください")
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
