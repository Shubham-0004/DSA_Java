import java.util.Scanner;

public class SumNatural {
    public static int printSum(int num){
        if (num==0) {
            return 0;
        }
        printSum(num-1);
        return num+printSum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number n:");
        int num=sc.nextInt();

        int output=printSum(num);
        System.out.println("The sum of natural numbers till n is :"+output);
    }
}
