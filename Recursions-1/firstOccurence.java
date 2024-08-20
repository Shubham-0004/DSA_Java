import java.util.Scanner;

public class firstOccurence {
    public static int isFound(int arr[],int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return isFound(arr,key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={2,3,4,5,7,4,5,8,9};
        int key=4;

        int output=isFound(arr,key,0);

        if (output!=-1) {
            System.out.println(key+ " is found at the index "+  output  +" in the first occurence");
        }else{
            System.out.println("Key not found.");
        }
    }
}
