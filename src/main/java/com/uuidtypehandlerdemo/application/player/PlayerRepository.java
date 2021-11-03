package com.uuidtypehandlerdemo.application.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;

public interface PlayerRepository {
    GamePlayer findGamePlayer(GamePlayer gamePlayer);
    void registerGamePlayer(GamePlayer gamePlayer);
}
