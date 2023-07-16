package com.game.chess;

public class Player extends User {
    TeamType teamType;
    int score;

    Player(final String name, final String email, final String phone, final TeamType teamType) {
        super(name, email, phone);
        this.teamType = teamType;
        this.score = 0;
    }
}