package com.uuidtypehandlerdemo.domain.model.player;

import javax.validation.Valid;

public class GamePlayer {
    @Valid
    PlayerNumber playerNumber;
    @Valid
    PlayerName playerName;

    @Deprecated
    GamePlayer() {
    }

    private GamePlayer(PlayerNumber playerNumber, PlayerName playerName) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
    }

    public PlayerNumber playerNumber() {
        return playerNumber;
    }

    public static GamePlayer from(PlayerNumber playerNumber, PlayerName playerName) {
        return new GamePlayer(playerNumber, playerName);
    }

    public static GamePlayer newGamePlayer(PlayerName playerName) {
        return new GamePlayer(
                PlayerNumber.generate(),
                playerName
        );
    }

    public PlayerName playerName() {
        return playerName;
    }

    public String show() {
        return String.format("%s : %S", playerNumber.value, playerName.value);
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "playerNumber=" + playerNumber +
                ", playerName=" + playerName +
                '}';
    }
}
