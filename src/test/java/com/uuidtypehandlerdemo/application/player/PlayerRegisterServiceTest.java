package com.uuidtypehandlerdemo.application.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;
import com.uuidtypehandlerdemo.domain.model.player.PlayerName;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class PlayerRegisterServiceTest {

    @Autowired
    PlayerRegisterService playerRegisterService;

    @Autowired
    PlayerQueryService playerQueryService;

    @Test
    @Transactional
    void ゲームプレイヤーを登録できること() {
        PlayerName testPlayerName = new PlayerName("ピザ配達人ヒロ");
        GamePlayer testTargetGamePlayer = GamePlayer.newGamePlayer(testPlayerName);
        playerRegisterService.registerGamePlayer(testTargetGamePlayer);
        GamePlayer result = playerQueryService.findGamePlayer(testTargetGamePlayer);
        assertAll(
                () -> assertEquals(testTargetGamePlayer.playerNumber().value(), result.playerNumber().value()),
                () -> assertEquals(testTargetGamePlayer.playerName().value(), result.playerName().value())
        );
    }

}