import java.util.Scanner;

public class xRaisedN {
    public static int Power(int base,int exp){
        if (exp==0) {
            return 1;
        }
        int base_exp_1 =Power(base, exp-1);
        int base_exp=base*base_exp_1;
        return base_exp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter base:");
        int base= sc.nextInt();

        System.out.print("Enter exponent:");
        int exp=sc.nextInt();

        int output = Power(base,exp);
        System.out.println(base + " is raised to "+exp+ " = "+output);

    }
}
