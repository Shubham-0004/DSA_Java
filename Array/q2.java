import java.util.*;
public class q2 {
    public static int Output(int nums[],int target){ // this mehod has the time complexiy of O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        //example 1
        //int nums[]={4,5,6,7,0,1,2};
        //int target=0;
        
        //example 2
        // int nums[]={4,5,6,7,0,1,2};
        // int target=3;

        //example 3
        int nums[]={1};
        int target=0;

        int result=Output(nums,target);
        System.out.println("Output = "+result);
    }
}
