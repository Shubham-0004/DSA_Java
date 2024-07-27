import java.util.*;
public class PairsInArray1 {

    public static void pairs(int collection[]){
        for (int i = 0; i < collection.length; i++) {
            for (int j = i; j < collection.length; j++) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    
        // created an array
        int collection[]={1,2,3,4,5,6};

        pairs(collection);
    }
}
