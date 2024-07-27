import java.util.*;
public class q1 {
    public static boolean Check(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
            if (array[i]==array[j]) {
                return true;
            }
        }
    }
    return false;
}
    public static void main(String[] args) {
        // return true if any value appears atleast twice and false if all distinct
        //int array[]={1,2,3,1};
        //int array[]={1,2,3,4};
        int array[]={1,1,1,3,3,4,3,2,4,2};
        // creating a function check
        boolean result = Check(array);
        System.out.println(result);
    }
}
