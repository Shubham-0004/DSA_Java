import java.util.*;
public class inputoutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrix:");
        int m= sc.nextInt();
        System.out.println("Enter the number of columns for the matrix:");
        int n= sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.println("Enter all the elements in the matrix.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("All the elements of the given matrix is diplayed below:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
