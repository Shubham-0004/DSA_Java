public class n_queen_n_rows {
    public static void printBoard(char board[][]){
        System.out.println("------Chess Board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    // place 1 queen only in each row
    public static void placeQueens(char board[][],int row){
        if (row==board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
           board[row][j]='Q'; 
           placeQueens(board, row+1);
           board[row][j]='X';
        }
    }
    
    public static void main(String[] args) {
        int n=2;
        char board [][] = new char[n][n];
        // initialise an empty board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
            System.out.println();
        }
        placeQueens(board,0);
    }
}
