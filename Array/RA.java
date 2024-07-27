import java.util.*;
public class RA {
    public static void ReverseArray(int collection[]){  
        for (int i = collection.length; i >=0; i--) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int collection[]={1,2,3,4,5,6,7};

        ReverseArray(collection);
    }
}
