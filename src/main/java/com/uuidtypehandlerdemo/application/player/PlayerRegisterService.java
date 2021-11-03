package com.uuidtypehandlerdemo.application.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;

import org.springframework.stereotype.Service;

@Service
public class PlayerRegisterService {

    PlayerRepository playerRepository;

    public PlayerRegisterService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    /**
     * ゲームプレイヤーを登録する
     */
    public void registerGamePlayer(GamePlayer gamePlayer) {
        playerRepository.registerGamePlayer(gamePlayer);
    }
}
