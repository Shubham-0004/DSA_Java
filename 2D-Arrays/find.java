import java.util.*;

public class find {
    public static boolean find(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              if (matrix[i][j]==key) {
                System.out.println("The key is found at "+"("+i+","+j+")");
                return true;
              }  
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[2][3];
        System.out.println("Enter the elements for the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the key to find in the matrix:");
        int key=sc.nextInt();
        boolean result=find(matrix,key);
        if (result==false) {
            System.out.println("The key is not found.");
        }
    }
}
