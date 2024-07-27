import java.util.*;
public class BS {
    public static int bS(int collection[],int key){
    int start=0;
    int end= collection.length-1;
    while (start<=end) {
        int middle=(start+end)/2;
        if (collection[middle]==key) {
            return middle;
        }
        if (collection[middle]>key) {
            end=middle-1;
        }else{
            start=middle+1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int collection[]=new int [size];
        System.out.println("Enter the elements of the array in the ascending order only:");
        for (int i = 0; i < collection.length; i++) {
            collection[i]=sc.nextInt();
        }

        System.out.println("Enter the key:");
        int key=sc.nextInt();

        int result=bS(collection,key);
        if (result==-1) {
            System.out.println("Key not found.");
        }else{
            System.out.println("Key found at the index "+result);
        }

    }
}
