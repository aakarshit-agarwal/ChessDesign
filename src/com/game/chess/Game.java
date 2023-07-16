package com.game.chess;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Game {
    String gameId;
    List<Player> players;
    Board board;
    GameStatus status;
    Player currentPlayer;

    public Game(final Player player1, final Player player2) {
        this.gameId = UUID.randomUUID().toString();
        this.players = Arrays.asList(player1, player2);
        this.board = new ChessBoard();
        this.currentPlayer = player1;
        this.status = GameStatus.NEW;
    }

    public Player whoseTurnNow() {
        return this.currentPlayer;
    }

    public GameStatus move(final Position srcPosition, final Position desPosition) {
        this.board.move(srcPosition, desPosition);

        if(this.currentPlayer == players.get(0)) {
            this.currentPlayer = this.players.get(1);
        } else {
            this.currentPlayer = this.players.get(0);
        }
        if(!this.board.areKingsAlive()) {
            this.status = GameStatus.ENDED;
        } else {
            this.status = GameStatus.IN_PROGRESS;
        }
        return this.status;
    }

    public List<Position> getNextMovesFor(final Position position) {
        return board.getNextMovesFor(position);
    }
}