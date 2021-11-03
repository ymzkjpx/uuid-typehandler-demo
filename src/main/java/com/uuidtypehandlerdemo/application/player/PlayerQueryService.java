package com.uuidtypehandlerdemo.application.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;

import org.springframework.stereotype.Service;

@Service
public class PlayerQueryService {

    PlayerRepository playerRepository;

    public PlayerQueryService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    /**
     * ゲームプレイヤーを検索する
     */
    public GamePlayer findGamePlayer(GamePlayer gamePlayer) {
        return playerRepository.findGamePlayer(gamePlayer);
    }
}
