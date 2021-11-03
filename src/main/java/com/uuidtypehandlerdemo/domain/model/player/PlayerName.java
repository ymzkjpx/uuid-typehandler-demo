package com.uuidtypehandlerdemo.domain.model.player;

import javax.validation.constraints.NotBlank;

public class PlayerName {
    @NotBlank(message = "名前を入力してください")
    String value;

    @Deprecated
    PlayerName() {
    }

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
