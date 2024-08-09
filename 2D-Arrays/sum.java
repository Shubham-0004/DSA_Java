import java.util.*;
public class sum {
    public static void main(String[] args) {    
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i==1) {
                    sum=sum+nums[i][j];
                }
            }
        }
        System.out.println("The sum of all the elements in the 2nd row is:"+sum);
    }
}
