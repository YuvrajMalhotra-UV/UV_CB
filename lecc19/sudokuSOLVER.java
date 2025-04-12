package lecc19;

public class sudokuSOLVER {
   

        // Function to solve the Sudoku puzzle using recursion and backtracking
        public static boolean solveSudoku(int[][] board) {
            // Try to find an empty cell in the grid
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    // If the cell is empty (denoted by 0), try to fill it
                    if (board[row][col] == 0) {
                        // Try numbers from 1 to 9
                        for (int num = 1; num <= 9; num++) {
                            // If placing the number is valid, place it and recursively solve the rest
                            if (isSafe(board, row, col, num)) {
                                board[row][col] = num;
    
                                // Recursively attempt to solve the rest of the board
                                if (solveSudoku(board)) {
                                    return true; // If the solution is found, return true
                                }
    
                                // If placing the number didn't work, reset the cell (backtrack)
                                board[row][col] = 0;
                            }
                        }
                        return false; // If no number from 1 to 9 works, return false (backtrack)
                    }
                }
            }
            return true; // If all cells are filled correctly, return true
        }
    
        // Check if it's safe to place a number in a given cell
        private static boolean isSafe(int[][] board, int row, int col, int num) {
            return !usedInRow(board, row, num) && 
                   !usedInCol(board, col, num) && 
                   !usedInBox(board, row - row % 3, col - col % 3, num);
        }
    
        // Check if the number is used in the given row
        private static boolean usedInRow(int[][] board, int row, int num) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == num) {
                    return true;
                }
            }
            return false;
        }
    
        // Check if the number is used in the given column
        private static boolean usedInCol(int[][] board, int col, int num) {
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == num) {
                    return true;
                }
            }
            return false;
        }
    
        // Check if the number is used in the 3x3 subgrid (box)
        private static boolean usedInBox(int[][] board, int boxStartRow, int boxStartCol, int num) {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row + boxStartRow][col + boxStartCol] == num) {
                        return true;
                    }
                }
            }
            return false;
        }
    
        // Function to print the Sudoku board (for debugging/visualization)
        public static void printBoard(int[][] board) {
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    System.out.print(board[r][c] + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            // Example Sudoku puzzle (0 represents empty cells)
            int[][] board = {
                {0, 0, 6, 8, 0, 4, 0, 0, 0},
                {2, 0, 1, 0, 6, 0, 0, 0, 7},
                {0, 3, 9, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 9, 8, 3, 0, 0},
                {0, 6, 0, 0, 0, 0, 0, 9, 0},
                {0, 0, 7, 3, 2, 0, 0, 0, 0},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 4, 0, 0, 0, 0, 1, 3, 0},
                {0, 0, 0, 0, 8, 3, 5, 7, 0},
            };
    
            // Solve the Sudoku puzzle
            if (solveSudoku(board)) {
                System.out.println("Sudoku solved successfully:");
                printBoard(board);
            } else {
                System.out.println("No solution exists.");
            }
        }
    }
    


