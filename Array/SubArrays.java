import java.util.*;
public class SubArrays {
    public static void SubArrays(int collection[]){
        for (int i = 0; i < collection.length; i++) {
            int start=i;
            for (int j = i; j < collection.length; j++) {
                int end=j;
                for (int k = start; k < end; k++) {
                    System.out.print(collection[k]+" ");
                }
            }System.out.println();
        }System.out.println();
    }
    public static void main(String[] args) {
        //creating an array
        int collection[]={1,2,3,4,5,6};
        //calling the function to print all the possible SubArrays
        SubArrays(collection);
    }
}
