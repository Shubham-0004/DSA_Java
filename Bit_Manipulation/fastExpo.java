import java.util.Scanner;

public class fastExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int a=sc.nextInt();

        System.out.println("Enter the exponent:");
        int exp=sc.nextInt();
        //int n = Integer.toBinaryString(exp);

        int ans = 1;
        while (exp!=0) {
            int c=exp&1;
            if (c!=0) {
                ans=ans*a;
            }
            a=a*a;
            exp=exp>>1;
        }
        System.out.println(ans);
    }
}
