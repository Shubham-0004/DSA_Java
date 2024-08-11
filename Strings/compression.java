import java.util.Scanner;

public class compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        System.out.print("Enter the keyword:");
        String keyword=sc.nextLine();
        System.out.println("You have entered "+keyword+".");

        for (int i = 0; i < keyword.length(); i++) {
            Integer count=1;
            while (i<keyword.length()-1 && keyword.charAt(i)==keyword.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(keyword.charAt(i));
            if (count>1) {
                sb.append(count);
            }
        }
        System.out.println("Result:"+sb.toString());
    }
}
