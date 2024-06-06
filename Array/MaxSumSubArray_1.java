import java.util.Scanner;

public class MaxSumSubArray_1 {
    public static int MaxSum(int Array[],int n){
        int Max_Sum=Integer.MIN_VALUE;
        int Curr_Sum=0;

        for (int i = 0; i <n ; i++) {
            int start=i;
            for (int j = i; j < n; j++) {
                int end=j;
                Curr_Sum=0;
                for (int k = start; k <= end; k++) {
                    Curr_Sum=Curr_Sum+Array[k];
                    if (Curr_Sum>Max_Sum) {
                        Max_Sum=Curr_Sum;
                    }
                }
            }
        }
        return Max_Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array->");
        int n=sc.nextInt();

        System.out.print("Enter the elements of the Array-->");
        int Array[]=new int[n];
        for (int i = 0; i < n; i++) {
            Array[i]=sc.nextInt();
        }

        int result=MaxSum(Array,n);
        System.out.println("The maxSum of SubArrays among all is "+result+".");
        sc.close();
    }
}
