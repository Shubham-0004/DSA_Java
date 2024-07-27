import java.util.*;
public class LinearSearch1 {
    public static int linearSearch(int collection[],int key) {
        for (int i = 0; i < collection.length; i++) {
            if(collection[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array-->");
        int n=sc.nextInt();
        int collection[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < collection.length; i++) {
            collection[i]=sc.nextInt();
        }

        System.out.println("Enter the key element:");
        int key=sc.nextInt();

        int result=linearSearch(collection,key);

        if (result == -1) {
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at the index="+result);
        }

    }
}
