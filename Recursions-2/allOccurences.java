import java.util.Scanner;

public class allOccurences {
    public static int noOfOcc(int arr[],int key,int i,int cnt){
        // base case
        if (i==arr.length) {
            return cnt;
        }
        // kaam kya hai
        if (arr[i]==key) {
            cnt++;
            System.out.println(i);
        }
        // recursive call
        return noOfOcc(arr, key, i+1,cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[]={3,2,4,5,6,2,7,2,2};
        int key =2;

        int output= noOfOcc(arr,key,0,0);
        System.out.println(key+" has been found "+output+" no. of times in the given array.");
    }
}
