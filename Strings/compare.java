import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        //here it gives output equal
        if (s1==s2) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //here with the same input the output is not equal
        if (s1==s3) {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        // thus we use s1.equals(s3)
        if (s1.equals(s3)) {
            System.out.println("Equal");
        }else{
            System.out.println("Not euqal");
        }
    }
}
