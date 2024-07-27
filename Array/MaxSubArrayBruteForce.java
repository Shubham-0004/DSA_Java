import java.util.*;
public class MaxSubArrayBruteForce { //brute force 
    public static void MaxSum(int collection[]){
        int CurrentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i = 0; i < collection.length; i++) {
            int start=i;
           for (int j = i; j < collection.length; j++) {
            int end=j;
            CurrentSum=0;
            for (int k = start; k <= end; k++) {
                CurrentSum=CurrentSum+collection[k];
                if (CurrentSum>MaxSum) {
                    MaxSum=CurrentSum;
                }
            }
           } 
        }
        System.out.println(MaxSum);
    }
    public static void Max_Sum1(int collection[]){ //   KADANE'S ALGORITHM
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < collection.length; i++) {
            currSum=currSum+collection[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }System.out.println(maxSum);
    }
    public static void main(String[] args) {
        // creating an array
        int collection[]={1,2,3,4,5,6,7,8};
        //calling the function 
        //MaxSum(collection);
        // calling the function of best time complexity
        Max_Sum1(collection);

    }
}
