import java.util.*;
public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First Name-->");
        String First_Name;
        First_Name=sc.nextLine();

        System.out.print("Please enter your Last Name-->");
        String Last_Name;
        Last_Name=sc.nextLine();

        String Full_Name=First_Name+" "+Last_Name;
        System.out.println(Full_Name);
        System.out.println(Full_Name.length());

        for (int i = 0; i < Full_Name.length(); i++) {
            System.out.print(Full_Name.charAt(i)+" ");
        }
    }
}
