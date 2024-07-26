import java.util.*;
public class TrappingRainwater {
    public static int TrappedRainwater(int height[]){
        // calculating the left max boundary
        int leftMax[]=new int [height.length];
        leftMax[0]=height[0];
        for (int i = 1; i <height.length; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculating the right max boundary
        int rightMax[]=new int [height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i =height.length-2; i >=0; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater=0;
        //final calculation
        for (int i = 0; i < height.length; i++) {
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater=trappedWater+waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //creating the array for the height of boundary walls
        int height[]={4,2,0,6,3,2,5};
        //calling the function 
        int result=TrappedRainwater(height);
        System.out.println("The Rainwater trapped inside the blocks is "+result);
    }
   
}