import java.util.*;
public class TransposeMatrix {
    public static void Transpose(int matrix[][]){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int TransposeMatrix[][]=new int [cols][rows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                TransposeMatrix[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i < TransposeMatrix.length; i++) {
            for (int j = 0; j < TransposeMatrix[0].length; j++) {
                System.out.print(TransposeMatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        Transpose(matrix);
    }
}
