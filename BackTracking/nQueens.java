public class nQueens {
    //Checking if it okay to place queen on particular position
    public static boolean isOk(char board[][],int row,int col){
        //checking for vertical up position
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //checking for right diagonal position
        for (int i = row-1 , j=col+1;i>=0 && j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //checking for left diagonal position
        for (int i = row-1 , j=col-1; i >=0 && j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    // function to print board
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
        //base case
        if (row==board.length) {
            printBoard(board);
            count++;
            return;
        }
        // recursion
        for (int j = 0; j < board.length; j++) {
            if(isOk(board,row,j)){
                board[row][j]='Q'; 
                placeQueens(board, row+1);
                board[row][j]='x';
            }
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n=5;
        char board [][] = new char[n][n];
        // initialise an empty board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='x';
            }
            System.out.println();
        }
        placeQueens(board,0);
        System.out.println("Total Ways to safely place QUEENS are :"+count+".");
    }
}

