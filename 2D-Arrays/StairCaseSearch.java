import java.util.*;
public class StairCaseSearch {
    public static boolean SearchKey(int sortedMatrix[][],int key){
        int row=0;
        int column=sortedMatrix[0].length-1;
        while (row<sortedMatrix.length && column>=0) {
            if (sortedMatrix[row][column]==key) {
                System.out.println("key found at the index ("+row+","+column+")");
                return true;
            }
            else if (sortedMatrix[row][column]>key) {
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
     // Search in a sorted matrix both row and column wise
    public static void main(String[] args) {
        int sortedMatrix[][]={{10,20,30,40},
                              {15,25,35,45},
                              {27,29,37,48},
                              {32,33,39,50}};
        int key=33;
        SearchKey(sortedMatrix,key);
    }
}
