package com.uuidtypehandlerdemo.infrastructure.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;
import com.uuidtypehandlerdemo.domain.model.player.PlayerNumber;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GamePlayerMapper {
    GamePlayer findGamePlayerByPlayerNumber(@Param("playerNumber") PlayerNumber playerNumber);

    void registerGamePlayer(@Param("gamePlayer") GamePlayer gamePlayer);
}
