package com.game.chess;

import java.util.UUID;

public abstract class Piece {
    String pieceId;
    TeamType teamType;
    PieceStatus status;

    public Piece(final TeamType teamType){
        this.pieceId = UUID.randomUUID().toString();
        this.teamType = teamType;
        this.status = PieceStatus.ALIVE;
    }
}