import java.util.Scanner;

public class BinarySearch {
    public static int Search(int sortedArray[],int key){
        int start=0;
        int end=sortedArray.length-1;
        while (start<=end) {
           int middle=(start+end)/2;
           if (sortedArray[middle]==key) {
            return middle;
           }
           if (sortedArray[middle]<key) {
            start=middle+1;
           }else{
            end=middle-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pre-Requisite --to have a sorted array
        int sortedArray[] = {1,2,3,4,5,6,7,8,9,10};

        // prompt the user to enter the key to find
        System.out.print("Enter the key-->");
        int key=sc.nextInt();

        int keyIndex=Search(sortedArray,key);
        if (keyIndex==-1) {
            System.out.print("Key NOT FOUND in the array !");
        }else{
        System.out.print("The key was found at the index "+keyIndex+"th of the array.");
        }
        sc.close();
    }
}
