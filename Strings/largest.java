import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruits[]={"Mango","Watermelon","Litchi"};

        String largest=fruits[0];

        for (int i = 0; i < fruits.length-1; i++) {
            if (fruits[i].compareTo(fruits[i+1])<0) {
                largest=fruits[i+1];
            }
        }
        System.out.println(largest);
    }
}
