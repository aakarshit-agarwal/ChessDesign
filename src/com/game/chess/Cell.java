package com.game.chess;

import java.util.UUID;

public class Cell {
    String cellId;
//    Position position;
//    boolean isOccupied;
    Piece occupiedBy;
    CellType type;

    Cell(final CellType cellType) {
        this.cellId = UUID.randomUUID().toString();
//        this.isOccupied = false;
        this.occupiedBy = null;
        this.type = cellType;
    }
}