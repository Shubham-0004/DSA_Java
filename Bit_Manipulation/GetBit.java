import java.util.Scanner;

public class GetBit { // gets the bit i.e 0/1 at the ith place
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number->");
        int num=sc.nextInt();
        System.out.println("Binary of num is "+Integer.toBinaryString(num));

        System.out.print("Enter the ith bit->");
        int bit = sc.nextInt();

        int c = 1<<bit;
        System.out.println("Binary of (1<<bit) is "+Integer.toBinaryString(c));

        int d = num & c;
        System.out.println("Binary of (num &c) is "+Integer.toBinaryString(d));

        if (d==0) {
            System.out.println("ith bit is 0.");
        }
        else{
            System.out.println("ith bit is 1.");
        }
    }
}
