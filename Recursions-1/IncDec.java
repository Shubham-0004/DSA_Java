import java.util.Scanner;

public class IncDec {
    public static void printInc(int n){
        if (n==0) {
           // System.out.print(n+" ");
            return ;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void printDec(int n){
        if (n==0) {
            //System.out.print(n+" ");
            return ;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n= sc.nextInt();

        System.out.println("Increasing Order:");
        printInc(n);
        System.out.println();
        System.out.println("Decreasing Order:");
        printDec(n);

    }
}
