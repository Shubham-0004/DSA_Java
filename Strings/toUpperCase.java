import java.util.Scanner;

public class toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        System.out.print("Enter any sentance here :");
        String Sentence=sc.nextLine();
        System.out.println("You have entered "+Sentence+".");

        char ch = Character.toUpperCase(Sentence.charAt(0));
        sb.append(ch);

        for (int i = 1; i < Sentence.length(); i++) {
            if (Sentence.charAt(i)==' '&& i<Sentence.length()-1) {
                sb.append(Sentence.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Sentence.charAt(i)));
            }else{
                sb.append(Sentence.charAt(i));
            }
        }
        System.out.println("Result:"+sb.toString());
       
    }
}
