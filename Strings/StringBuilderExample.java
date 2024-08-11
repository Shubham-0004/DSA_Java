import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        for (char ch= 'a'; ch<='z'; ch++) {
            sb.append(ch);
            System.out.print(ch+" ");
        }
    }
}
