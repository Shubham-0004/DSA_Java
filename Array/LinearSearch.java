import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] collection, int key) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] collection = new int[n];
        System.out.print("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            collection[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search in the collection: ");
        int key = sc.nextInt();

        int result = linearSearch(collection, key);
        if (result == -1) {
            System.out.println("Key not found in the collection.");
        } else {
            System.out.println("Key found at index: " + result);
        }
        sc.close();
    }
}
