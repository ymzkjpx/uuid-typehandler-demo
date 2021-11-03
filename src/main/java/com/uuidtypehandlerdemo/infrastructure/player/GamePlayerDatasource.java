package com.uuidtypehandlerdemo.infrastructure.player;

import com.uuidtypehandlerdemo.application.player.PlayerRepository;
import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GamePlayerDatasource implements PlayerRepository {

    GamePlayerMapper gamePlayerMapper;

    public GamePlayerDatasource(GamePlayerMapper gamePlayerMapper) {
        this.gamePlayerMapper = gamePlayerMapper;
    }

    @Override
    public GamePlayer findGamePlayer(GamePlayer gamePlayer) {
        GamePlayer result = gamePlayerMapper.findGamePlayerByPlayerNumber(gamePlayer.playerNumber());
        return result;
    }

    @Override
    @Transactional
    public void registerGamePlayer(GamePlayer gamePlayer) {
        gamePlayerMapper.registerGamePlayer(gamePlayer);
    }
}
