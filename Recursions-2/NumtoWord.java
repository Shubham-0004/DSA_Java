import java.util.Scanner;

public class NumtoWord {
    public static void toWord(int n){
        //base case
        if (n==0) {
            return;
        }
        //recursive call
        toWord(n/10);
        //last digit
        int digit=n%10;
       
        switch (digit) {
            case 0:
                if (digit==0) {
                 System.out.print("zero ");
                }
                break;
            case 1:
                if (digit==1) {
                 System.out.print("one ");
                }
                break;
            case 2:
                if (digit==2) {
                 System.out.print("two ");
                }
                break;
            case 3:
                if (digit==3) {
                 System.out.print("three ");
                }
                break;
            case 4:
                if (digit==4) {
                 System.out.print("four ");
                }
                break;
            case 5:
                if (digit==5) {
                 System.out.print("five ");
                }
                break;
            case 6:
                if (digit==6) {
                System.out.print("six ");
                }
                break;
            case 7:
                if (digit==7) {
                 System.out.print("seven ");
                }
                break;
            case 8:
                if (digit==8) {
                 System.out.print("eight ");
                }
                break;
            case 9:
                if (digit==9) {
                 System.out.print("nine ");
                }
                break;
            default:
                break;
        }
        // recursive call
        //int newNum=(int)n%Math.pow(10, cnt-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n= sc.nextInt();

        if (n==0) {
            System.out.println("Zero");
        }else{
            toWord(n);
        }
    }
}
