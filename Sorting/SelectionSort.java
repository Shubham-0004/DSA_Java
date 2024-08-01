import java.util.*;
import java.util.Arrays;
public class SelectionSort {
    public static void SelectionSort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minPos]>array[j]) {
                    minPos=j;
                }
            }
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }
        System.out.println("Sorted Array:"+Arrays.toString(array)); 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int array[]={5,4,1,3,2};
        SelectionSort(array);
    }
}
