public class NQueens {
    static void solveNQ(int board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                solveNQ(board, row + 1);
                board[row][col] = 0; // Backtrack
            }
        }
    }

    static boolean isSafe(int board[][], int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void printBoard(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Change this value to solve for different sizes
        int board[][] = new int[n][n];
        solveNQ(board, 0);
    }
    
}
