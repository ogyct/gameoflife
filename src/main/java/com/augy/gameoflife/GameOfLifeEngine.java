package com.augy.gameoflife;

public class GameOfLifeEngine {


    private final int ROWS;
    private final int COLUMNS;

    public GameOfLifeEngine(int ROWS, int COLUMNS) {
        this.ROWS = ROWS;
        this.COLUMNS = COLUMNS;
    }

    public void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public int[][] nextGeneration(int[][] grid) {
        int[][] future = new int[ROWS][COLUMNS];
        if (grid.length != ROWS || grid[0].length != COLUMNS) {
            throw new RuntimeException("Input grid doesn't match the size of the original grid");
        }

        // Loop through every cell
        for (int column = 1; column < grid.length - 1; column++) {
            for (int line = 1; line < grid[column].length - 1; line++) {
                // finding no Of Neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        aliveNeighbours += grid[column + i][line + j];
                    }
                }

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= grid[column][line];

                // Cell is lonely and dies
                if ((grid[column][line] == 1) && (aliveNeighbours < 2))
                    future[column][line] = 0;

                    // Cell dies due to over population
                else if ((grid[column][line] == 1) && (aliveNeighbours > 3))
                    future[column][line] = 0;

                    // A new cell is born
                else if ((grid[column][line] == 0) && (aliveNeighbours == 3))
                    future[column][line] = 1;

                    // Remains the same
                else
                    future[column][line] = grid[column][line];
            }
        }
        return future;
    }

}
