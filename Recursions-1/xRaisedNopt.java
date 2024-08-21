import java.util.Scanner;

public class xRaisedNopt { // time complexity is O(logN)
    public static int PowOp(int b,int exp){
        if (exp==0) {
            return 1;
        }
        int halfPower = PowOp(b,exp/2);
        int halfPowerSq = halfPower * halfPower;
        if (exp%2!=0) {
            return b * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base :");
        int b = sc.nextInt();

        System.out.print("Enter exponent : ");
        int exp = sc.nextInt();

        int output = PowOp(b,exp);
        System.out.println(b +" raised to "+exp+ " ="+output);
    }

}
