import java.util.Scanner;

public class lastOccurence {
    public static int isFound(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        int isit=isFound(arr, key, i+1);
        if (isit==-1 && arr[i]==key) {
            return i;
        }
        return isit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={2,1,3,4,2,1,5};
        int key=1;

        int output=isFound(arr,key,0);
        System.out.println("The "+key+" is found at the index "+output+ " as the last occurence in the array.");
    }
}
