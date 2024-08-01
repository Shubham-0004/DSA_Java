import java.util.*;


public class InsertionSort {
    public static void InsertionSort(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int curr=numbers[i];
            int prev=i-1;
            while ((prev>=0)&&(numbers[prev]>curr)) {
               numbers[prev+1]=numbers[prev];
               prev--; 
            }
            numbers[prev+1]=curr;
        }
        System.out.println("Insertion Sort: "+ Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numbers[]={3,5,1,2,4};
        InsertionSort(numbers);
    }
}
