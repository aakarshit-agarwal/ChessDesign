package com.game.chess;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Board {
    String boardId;
    ArrayList<ArrayList<Cell>> cells;

    public Board(final Integer rows, final Integer cols) {
        this.boardId = UUID.randomUUID().toString();
        this.cells = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            this.cells.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                if((row + col) % 2 == 0) {
                    this.cells.get(row).add(new Cell(CellType.BLACK));
                } else {
                    this.cells.get(row).add(new Cell(CellType.WHITE));
                }
            }
        }
    }

    public abstract void move(final Position srcPosition, final Position desPosition);

    public abstract boolean areKingsAlive();

    public abstract List<Position> getNextMovesFor(final Position position);
}