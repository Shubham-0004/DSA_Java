import java.util.*;
public class DiagonalSum {
    public static int DiagonalSumLinearComplexity(int sqMatrix[][]){
        int sum=0;
        for (int i = 0; i < sqMatrix.length; i++) {
            sum=sum+sqMatrix[i][i];
            if (i!=sqMatrix.length-i-1) {    // i!=j
                sum=sum+sqMatrix[i][sqMatrix.length-i-1];
            }
        }
        return sum;
    }
    public static int DiagonalSumBruteForce(int sqMatrix[][]){
        int sum=0;
        for (int i = 0; i < sqMatrix.length; i++) {
            for (int j = 0; j < sqMatrix[0].length; j++) {
             if (i==j) {
                sum=sum+sqMatrix[i][j];
             }   
             else if (i+j==sqMatrix.length-1) {
                sum=sum+sqMatrix[i][j];
             }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sqMatrix[][]={{1,2,3,0,1},
                          {2,4,-5,-1,10},
                          {1,-2,4,7,5},
                          {-9,3,0,1,3},
                          {1,2,3,4,5}};
        int result = DiagonalSumBruteForce(sqMatrix);
        int result_1=DiagonalSumLinearComplexity(sqMatrix);
        System.out.println("The sum of all the elements on the diagonal of the given matrix using brute force is:"+result);
        System.out.println("The sum of all the elements on the diagonal of the given matrix using linear complexity is:"+result_1);
    }
    }
