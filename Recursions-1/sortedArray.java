import java.util.Scanner;

public class sortedArray {
    public static boolean isSorted(int arr[],int i){
        if (arr.length-1==i) {
            return true;
        }
        if (arr [i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int arr[]={1,2,3,4};
        boolean isit= isSorted(arr,0);
        System.out.print(isit);
    }
}
