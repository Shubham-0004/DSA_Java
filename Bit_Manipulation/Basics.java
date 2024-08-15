
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //AND
        System.out.print("AND"+" ");
        System.out.println(4&5);
        //OR
        System.out.print("OR"+" ");
        System.out.println(4|5);
        //XOR
        System.out.print("XOR"+" ");
        System.out.println(4^5);
        // complement
        System.out.print("Complement"+" ");
        System.out.println(~5);
        //Left Shift
        System.out.print("Left Shift"+" ");
        System.out.println(5<<2);
        //Right Shift
        System.out.print("Right Shift"+" ");
        System.out.println(6>>1);

    }
}
