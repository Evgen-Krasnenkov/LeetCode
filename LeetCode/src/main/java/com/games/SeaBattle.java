package com.games;

import java.util.Random;
import java.util.Scanner;

public class SeaBattle {

    private static final int GRID_SIZE = 10;
    private static final int[] SHIP_SIZES = {3, 2, 2, 1, 1, 1};
    private static final char EMPTY = '~';
    private static final char SHIP = 'S';
    private static final char HIT = 'X';
    private static final char MISS = 'O';

    public static void main(String[] args) {
        System.out.println("Welcome to Sea Battle!");

        char[][] playerGrid = createEmptyGrid();
        char[][] computerGrid = createEmptyGrid();
        char[][] computerGridHidden = createEmptyGrid();

        // Player places ships
        System.out.println("Place your ships:");
        playerPlaceShips(playerGrid);

        // Computer places ships randomly
        randomShipPlacement(computerGrid, SHIP_SIZES);

        // Game loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nYour Grid:");
            printGrid(playerGrid);
            System.out.println("\nComputer's Grid:");
            printGrid(computerGridHidden);

            // Player's turn
            System.out.println("\nYour turn:");
            playerTurn(scanner, computerGrid, computerGridHidden);

            // Check if player wins
            if (checkWin(computerGrid)) {
                System.out.println("You win! All computer ships are sunk!");
                break;
            }

            // Computer's turn
            System.out.println("\nComputer's turn:");
            computerTurn(playerGrid);

            // Check if computer wins
            if (checkWin(playerGrid)) {
                System.out.println("You lose! All your ships are sunk!");
                break;
            }
        }

        scanner.close();
    }

    private static char[][] createEmptyGrid() {
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }
        return grid;
    }

    private static void printGrid(char[][] grid) {
        System.out.print("  ");
        for (int i = 0; i < GRID_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < GRID_SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidPlacement(char[][] grid, int x, int y, int size, char direction) {
        for (int i = 0; i < size; i++) {
            int nx = x + (direction == 'H' ? 0 : i);
            int ny = y + (direction == 'H' ? i : 0);

            if (nx >= GRID_SIZE || ny >= GRID_SIZE || grid[nx][ny] != EMPTY) {
                return false;
            }
        }
        return true;
    }

    private static void placeShip(char[][] grid, int x, int y, int size, char direction) {
        for (int i = 0; i < size; i++) {
            int nx = x + (direction == 'H' ? 0 : i);
            int ny = y + (direction == 'H' ? i : 0);
            grid[nx][ny] = SHIP;
        }
    }

    private static void randomShipPlacement(char[][] grid, int[] shipSizes) {
        Random random = new Random();
        for (int size : shipSizes) {
            while (true) {
                int x = random.nextInt(GRID_SIZE);
                int y = random.nextInt(GRID_SIZE);
                char direction = random.nextBoolean() ? 'H' : 'V';

                if (isValidPlacement(grid, x, y, size, direction)) {
                    placeShip(grid, x, y, size, direction);
                    break;
                }
            }
        }
    }

    private static void playerPlaceShips(char[][] grid) {
        Scanner scanner = new Scanner(System.in);
        for (int size : SHIP_SIZES) {
            while (true) {
                System.out.println("\nPlace a ship of size " + size + ":");
                printGrid(grid);
                System.out.print("Enter row (0-9): ");
                int x = scanner.nextInt();
                System.out.print("Enter column (0-9): ");
                int y = scanner.nextInt();
                System.out.print("Enter direction (H for horizontal, V for vertical): ");
                char direction = scanner.next().toUpperCase().charAt(0);

                if (direction != 'H' && direction != 'V') {
                    System.out.println("Invalid direction. Try again.");
                    continue;
                }

                if (isValidPlacement(grid, x, y, size, direction)) {
                    placeShip(grid, x, y, size, direction);
                    break;
                } else {
                    System.out.println("Invalid placement. Try again.");
                }
            }
        }
    }

    private static void playerTurn(Scanner scanner, char[][] computerGrid, char[][] computerGridHidden) {
        while (true) {
            System.out.print("Enter row (0-9) to fire: ");
            int x = scanner.nextInt();
            System.out.print("Enter column (0-9) to fire: ");
            int y = scanner.nextInt();

            if (x < 0 || x >= GRID_SIZE || y < 0 || y >= GRID_SIZE) {
                System.out.println("Out of bounds. Try again.");
                continue;
            }

            if (computerGridHidden[x][y] == HIT || computerGridHidden[x][y] == MISS) {
                System.out.println("You already fired here. Try again.");
                continue;
            }

            if (computerGrid[x][y] == SHIP) {
                System.out.println("Hit!");
                computerGrid[x][y] = HIT;
                computerGridHidden[x][y] = HIT;
            } else {
                System.out.println("Miss!");
                computerGrid[x][y] = MISS;
                computerGridHidden[x][y] = MISS;
            }
            break;
        }
    }

    private static void computerTurn(char[][] playerGrid) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(GRID_SIZE);
            int y = random.nextInt(GRID_SIZE);

            if (playerGrid[x][y] == HIT || playerGrid[x][y] == MISS) {
                continue;
            }

            if (playerGrid[x][y] == SHIP) {
                System.out.println("Computer fires at (" + x + ", " + y + ") - Hit!");
                playerGrid[x][y] = HIT;
            } else {
                System.out.println("Computer fires at (" + x + ", " + y + ") - Miss!");
                playerGrid[x][y] = MISS;
            }
            break;
        }
    }

    private static boolean checkWin(char[][] grid) {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (grid[i][j] == SHIP) {
                    return false;
                }
            }
        }
        return true;
    }
}