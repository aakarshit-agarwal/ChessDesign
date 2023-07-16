package com.game.chess;

import com.game.chess.pieces.*;

import java.util.List;

class ChessBoard extends Board {
    Piece whiteKing;
    Piece blackKing;

    ChessBoard() {
        super(8, 8);
        initPieces();
    }
    private void initPieces() {
        int REQUIRED_KING = 1;
        int REQUIRED_QUEEN = 1;
        int REQUIRED_BISHOP = 2;
        int REQUIRED_KNIGHT = 2;
        int REQUIRED_ROOK = 2;
        int REQUIRED_PAWN = 8;

        this.whiteKing = new King(TeamType.WHITE);
        this.blackKing= new King(TeamType.BLACK);
        this.cells.get(0).get(3).occupiedBy = this.whiteKing;
        this.cells.get(7).get(4).occupiedBy = this.blackKing;

        this.cells.get(0).get(4).occupiedBy = new Queen(TeamType.WHITE);
        this.cells.get(7).get(3).occupiedBy = new Queen(TeamType.BLACK);


        this.cells.get(0).get(2).occupiedBy = new Bishop(TeamType.WHITE);
        this.cells.get(0).get(5).occupiedBy = new Bishop(TeamType.WHITE);
        this.cells.get(7).get(2).occupiedBy = new Bishop(TeamType.BLACK);
        this.cells.get(7).get(5).occupiedBy = new Bishop(TeamType.BLACK);

        this.cells.get(0).get(1).occupiedBy = new Knight(TeamType.WHITE);
        this.cells.get(0).get(6).occupiedBy = new Knight(TeamType.WHITE);
        this.cells.get(7).get(1).occupiedBy = new Knight(TeamType.BLACK);
        this.cells.get(7).get(6).occupiedBy = new Knight(TeamType.BLACK);

        this.cells.get(0).get(0).occupiedBy = new Rook(TeamType.WHITE);
        this.cells.get(0).get(7).occupiedBy = new Rook(TeamType.WHITE);
        this.cells.get(7).get(0).occupiedBy = new Rook(TeamType.BLACK);
        this.cells.get(7).get(7).occupiedBy = new Rook(TeamType.BLACK);

        this.cells.get(1).get(0).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(1).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(2).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(3).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(4).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(5).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(6).occupiedBy = new Pawn(TeamType.WHITE);
        this.cells.get(1).get(7).occupiedBy = new Pawn(TeamType.WHITE);


        this.cells.get(6).get(0).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(1).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(2).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(3).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(4).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(5).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(6).occupiedBy = new Pawn(TeamType.BLACK);
        this.cells.get(6).get(7).occupiedBy = new Pawn(TeamType.BLACK);
    }

    @Override
    public void move(Position srcPosition, Position desPosition) {

    }

    @Override
    public boolean areKingsAlive() {
        return this.whiteKing.status == PieceStatus.ALIVE &&
                this.blackKing.status == PieceStatus.ALIVE;
    }

    @Override
    public List<Position> getNextMovesFor(Position position) {
        return null;
    }
}