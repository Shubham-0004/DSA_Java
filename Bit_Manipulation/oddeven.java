import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c = num&1;
        if (c==1) {
           System.out.println("ODD"); 
        }
        else{
            System.out.println("EVEN");
        }

    }
}
