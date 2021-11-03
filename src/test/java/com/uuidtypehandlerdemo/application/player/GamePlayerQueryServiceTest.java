package com.uuidtypehandlerdemo.application.player;

import com.uuidtypehandlerdemo.domain.model.player.GamePlayer;
import com.uuidtypehandlerdemo.domain.model.player.PlayerName;
import com.uuidtypehandlerdemo.domain.model.player.PlayerNumber;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@ActiveProfiles("test")
class GamePlayerQueryServiceTest {

    @Autowired
    PlayerQueryService playerQueryService;

    @Test
    void ユーザーをユーザー番号で検索できること() {
        GamePlayer testTargetGamePlayer = GamePlayer.from(
                PlayerNumber.from(UUID.fromString("530f9ad1-f3fc-4e22-a2f7-c4eeb4e41b78")),
                new PlayerName("実在するユーザー")
        );
        GamePlayer result = playerQueryService.findGamePlayer(testTargetGamePlayer);
        assertAll(
                () -> assertEquals(testTargetGamePlayer.playerNumber().value(), result.playerNumber().value()),
                () -> assertNotNull(result.playerName().value())
        );
    }

    @Test
    void 実在しないユーザー番号の結果が空であること() {
        GamePlayer testTargetGamePlayer = GamePlayer.from(
                PlayerNumber.from(UUID.randomUUID()),
                new PlayerName("実在しないユーザー")
        );
        GamePlayer result = playerQueryService.findGamePlayer(testTargetGamePlayer);
        assertAll(
                () -> assertNull(result)
        );

    }
}