import java.util.*;
public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count =0;
        while (n!=0) {
           int c = n&1;
           if (c==1) {
            count++;
           } 
           n=n>>1;
        }
        System.out.println(count);
    }
}
