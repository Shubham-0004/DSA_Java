import java.util.*; 
public class checkPower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter any number to check whether it is power of 2 or not.");
        int num=sc.nextInt();
        int c=num-1;
        int d=num & c;
        if (d==0) {
            System.out.println(num+" is the power of 2.");
        }
        else{
            System.out.println(num+" is not the power of 2.");
        }
    }
}
