package main;

import java.util.Random;

public class GameOfLife {
    public final int SIZE;
    private static final int ALIVE = 1;
    private static final int DEAD = 0;
    private int[][] lifeMatrix;// the array that will be used through the game
    private int[][] copyMatrix;// the copy array will be used to check the neighbors without changes made to
                               // the original matrix

    public GameOfLife(int size, int[][] grid) {
        SIZE = size;

        if (grid == null) {
            lifeMatrix = new int[SIZE][SIZE];// creates the new matrix
            copyMatrix = new int[SIZE][SIZE];// creates the copy matrix to be used later
            Random rand = new Random();
            int randomValue;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    randomValue = rand.nextInt(2);
                    lifeMatrix[i][j] = randomValue;// gives lifeMatrix[i][j] a int value of 0 or 1.
                }
            }
        } else {
            lifeMatrix = grid;
            copyMatrix = grid;
        }

        System.out.println("Display Initial Grid");
        displayGrid(lifeMatrix);
    }

    // Initializing the grid.
    public void displayGrid(int[][] grid) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * This method checks every cell value for the next generation and updates the
     * matrix
     */
    public int[][] nextGenMat() {
        int neighbors;
        copyLifeMat();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                neighbors = 0;
                neighbors = calculateAliveNeighbors(i, j);
                if (lifeMatrix[i][j] == ALIVE) {
                    if (neighbors == 2 || neighbors == 3)
                        lifeMatrix[i][j] = ALIVE;
                    if (neighbors < 2 || neighbors > 3)
                        lifeMatrix[i][j] = DEAD;
                } else if (lifeMatrix[i][j] == DEAD) {
                    if (neighbors == 3)
                        lifeMatrix[i][j] = ALIVE;
                }
            }

        }
        System.out.println("Display Next Generation Grid");
        displayGrid(lifeMatrix);
        return lifeMatrix;
    }

    private int calculateAliveNeighbors(int i, int j) {
        int neighbors = 0;
        int left = j - 1;
        int up = i - 1;
        int right = j + 1;
        int down = i + 1;
        if (left >= 0) {// will check the three left neighbors
            neighbors += copyMatrix[i][left];
            if (up >= 0) {
                neighbors += copyMatrix[up][left];
            }
            if (down < SIZE) {
                neighbors += copyMatrix[down][left];
            }
        }
        if (right < SIZE) {// will check the three right neighbors
            neighbors += copyMatrix[i][right];
            if (up >= 0) {
                neighbors += copyMatrix[up][right];
            }
            if (down < SIZE) {
                neighbors += copyMatrix[down][right];
            }
        }
        if (up >= 0) {// checks the cell above
            neighbors += copyMatrix[up][j];
        }
        if (down < SIZE) {// checks the cell below
            neighbors += copyMatrix[down][j];
        }
        return neighbors;// returns the amount of neighbors
    }

    private void copyLifeMat() { // copies lifeMatrix to copyMatrix
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                copyMatrix[i][j] = lifeMatrix[i][j];
    }

}