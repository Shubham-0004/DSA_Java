import java.util.Scanner;

public class countSmallcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter something:");
        String str=sc.nextLine();

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>=97 && str.charAt(i)<=122) {
                count++;
            }
        }
        System.out.println(count);
    }
}
