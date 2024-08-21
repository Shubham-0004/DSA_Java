import java.util.Scanner;

public class Length {
    public static int chkL(String str,int i){
        //base case
        if (i==str.length()) {
            return 0;
        }
        return 1+chkL(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String str=sc.nextLine();

        int output =chkL(str,0);
        System.out.println("The length of given string is "+output+".");
    }
}
