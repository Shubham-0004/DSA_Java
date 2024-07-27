import java.util.*;
    public class q3 {
    public static int maxProfit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>buyPrice) {
                int Profit=prices[i]-buyPrice;
                maxProfit=Math.max(Profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        //int prices[]={7,1,5,3,6,4};
        int prices[]={7,6,4,3,1};
        int result=maxProfit(prices);
        System.out.println("Max Profit earned can be "+result+".");
    }
}
