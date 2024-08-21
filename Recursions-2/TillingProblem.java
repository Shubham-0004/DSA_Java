import java.util.Scanner;

public class TillingProblem {
    // given there is a floor of dimensions 2 X N and we need to set tiles of dimensions
    // 2 X 1 which can be placed vertically or horizontally.
    // find the total number of tiles to do it

    public static int noOfWays(int n){
        if (n==0 || n==1) {
            return 1; 
        }

        // horizontally
        int hor = noOfWays(n-2);

        // vertically
        int ver = noOfWays(n-1);

        return hor+ver;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Current Dimension of the floor is : 2 X "+n);

        System.out.println("Dimension of each tile is : 2 X 1");

        int output = noOfWays(n);
        System.out.println("The total of tiles required is "+output);
    }
}
