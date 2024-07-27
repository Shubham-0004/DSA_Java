import java.util.*;

    public class q4 {
        public static int trappedRainwater(int height[]){
            //calculate left max boundary
            int leftMax[]=new int[height.length];
            leftMax[0]=height[0];
            for (int i = 1; i < height.length; i++) {
                leftMax[i]=Math.max(leftMax[i-1], height[i]);
            }
            //calculate right max boundary
            int rightMax[]=new int[height.length];
            rightMax[height.length-1]=height[height.length-1];
            for (int i = height.length-2; i>=0; i--) {
                rightMax[i]=Math.max(rightMax[i+1], height[i]);
            }
            int trappedWater=0;
            for (int i = 0; i < height.length; i++) {
                int waterLevel=Math.min(rightMax[i], leftMax[i]);
                trappedWater=trappedWater+waterLevel-height[i];
            }
            return trappedWater;
        }
    public static void main(String[] args) {
        //int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int height[]={4,2,0,3,2,5};
        int result=trappedRainwater(height);
        System.out.println("The max rainwater trapped inside the blocks is "+result+".");
    }
}
