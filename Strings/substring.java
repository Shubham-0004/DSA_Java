import java.util.Scanner;

public class substring {
    public static void Substring(String keyword){
        Scanner sc= new Scanner(System.in);

        String sub=""; // initialize with a null substring

        System.out.println("Enter the starting index::");
        int starting_index =sc.nextInt();

        System.out.println("Enter the ending index::");
        int ending_index=sc.nextInt();

        for (int i = starting_index; i < ending_index; i++) {
            sub=sub+""+keyword.charAt(i);
        }
        System.out.println(sub);
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter some keyword:");
        String keyword=sc.nextLine();
        System.out.println("Input: "+keyword);

        Substring(keyword);
    }
}
