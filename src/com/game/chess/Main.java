package com.game.chess;

public class Main {

    public static void main(String[] args) {
        System.out.println("Launching Chess Game");

        Player player1 = new Player("Player1", "player1@game.com", "123", TeamType.WHITE);
        Player player2 = new Player("Player2", "player2@game.com", "987", TeamType.BLACK);

        Game chessGame = new Game(player1, player2);

    }
}
