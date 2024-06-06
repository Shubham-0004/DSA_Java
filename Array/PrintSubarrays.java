import java.util.Scanner;

public class PrintSubarrays {
    public static void SubArrays(int Array[],int size){
        for (int i = 0; i < Array.length; i++) {
            int start=i;
            for (int j = i; j < Array.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    System.out.print(Array[k]+" ");
                }
                System.out.println();
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array->");
        int size = sc.nextInt();

        System.out.print("Enter all the elements of the array-->");
        int Array[]=new int[size];
        for (int i = 0; i < Array.length; i++) {
            Array[i]=sc.nextInt();
        }

        SubArrays(Array,size);
        sc.close();
    }
}
