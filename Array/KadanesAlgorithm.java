import java.util.Scanner;

public class KadanesAlgorithm {
    public static int Kadanes(int Array[],int n){
        int Curr_Sum=0;
        int Max_Sum=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
           Curr_Sum=Curr_Sum+Array[i];
           if (Curr_Sum<0) {
            Curr_Sum=0;
           }
           Max_Sum=Math.max(Max_Sum, Curr_Sum); 
        }
        return Max_Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array->");
        int n = sc.nextInt();

        System.out.print("Enter all the elements of the array-->");
        int Array[]=new int[n];
        for (int i = 0; i < n; i++) {
            Array[i]=sc.nextInt();
        }

        int Max_Sum=Kadanes(Array,n);
        System.out.print("The max sum of the sub array among all is "+Max_Sum+".");
        sc.close();
    }
}
