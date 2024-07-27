import java.util.*;
public class LargestElement {
    public static int findLargest(int collection[]){
        int largest=0;
        for (int i = 0; i < collection.length; i++) {
            if(collection[i]>largest){
                largest=collection[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array-->");
        int n=sc.nextInt();
        int collection[]=new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < collection.length; i++) {
            collection[i]=sc.nextInt();
        }

        int result=findLargest(collection);
        System.out.println("The largest element in the given array is "+result);
    }
}
