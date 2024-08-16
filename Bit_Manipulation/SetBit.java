import java.util.Scanner;

public class SetBit { // primary goal is to set 1 at the ith place 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number->");
        int num = sc.nextInt();
        System.out.println("Binary of number is "+Integer.toBinaryString(num));

        System.out.print("Enter the ith place->");
        int i = sc.nextInt();

        int c = 1<<i;
        System.out.println("Binary of (1<<i) is "+Integer.toBinaryString(c));

        int d = num | c;
        System.out.println("Binary of num|(1<<i) is "+Integer.toBinaryString(d));

        System.out.println("Output : "+d);
    }
}
