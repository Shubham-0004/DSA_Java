import java.util.*;

public class printNumbers {
        public static void printDec (int n){ // from n to 1 in decreasing order
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
        public static void printInc(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the value of n:");
        int n= sc.nextInt();

        System.out.println("Decreasing Order:");
        printDec(n);

        System.out.println("Increasing Order:");
        printInc(n);
    }
}
