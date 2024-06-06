import java.util.Scanner;

public class PairsInArray {
    public static void Pairs_Array(int Array[],int size){
        for (int i = 0; i <size; i++) {
            for (int j = i+1; j < size; j++) {
                System.out.print("("+Array[i]+","+Array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array-->");
        int size=sc.nextInt();

        System.out.println("Enter the elements of the array->");
        int Array[]=new int[size];
        for (int i = 0; i < size; i++) {
            Array[i]=sc.nextInt();
        }

        Pairs_Array(Array,size);
        sc.close();
    }
}
