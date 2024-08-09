import java.util.*;

public class BubbleSort {

    //Large elements come to end of te array by swapping with adjacent elements
    public static void SortedArray(int numbers[]){
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if (numbers[j]<numbers[j+1]) {  // for descending order
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array :"+Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[]={5,4,1,3,2};
        SortedArray(numbers);
    }
}
