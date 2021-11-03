DROP TABLE IF EXISTS game_player;
DROP SCHEMA IF EXISTS player CASCADE;
CREATE SCHEMA player;

CREATE TABLE player.game_player
(
    player_number UUID PRIMARY KEY ,
    player_name VARCHAR (50) NOT NULL
);
