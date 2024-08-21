import java.util.Scanner;

public class FriendsPairingPrb { 
    // Given n number of friends ,each one can remain single or paired up withs some other 
    // friend.Each friend can be paired up only once.Find out the total number of ways 
    // in which friends can be remain single or paired up
    public static int totalWays(int n){
        if (n==1 || n==2) {
            return n;
        }
        int single = totalWays(n-1);
        int paired = totalWays(n-2)*(n-1);
        return single + paired;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of friends:");
        int n = sc.nextInt();

        int output = totalWays(n);
        System.out.println("The required number of ways as per the arrangement is :"+output);
    }
}
