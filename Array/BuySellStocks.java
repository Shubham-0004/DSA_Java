import java.util.*;
public class BuySellStocks {
    public static int maxProfit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice<prices[i]) {  
                //profit
                int Profit=prices[i]-buyPrice; //ith day profit
                maxProfit=Math.max(maxProfit, Profit);                
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        // creating the array for the prices of Stocks
        int prices[]={7,1,5,3,6,4};
        // calling the function 
        int result=maxProfit(prices);

        System.out.println("The maximum profit earned can be "+result);
    }
}
