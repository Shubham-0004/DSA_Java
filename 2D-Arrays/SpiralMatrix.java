import java.util.*;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while ((startRow<=endRow)&&(startCol<=endCol)) {
            
            //top elements
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
            }
            startRow++;

            //right elements
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            endCol--;

            //bottom elements
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(matrix[endRow][i]+" ");
            }
            endRow--;

            //left elements
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // taking input matrix
        int matrix[][]= {{1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20},
                         {21,22,23,24,25}};
        
        printSpiral(matrix);
    }
}
