import java.util.Scanner;

public class ReverseArray {
            
    public static void ReverseArray(int Array[],int size){
        System.out.println();
           int start=0;
           int last = size-1;

        while(start<last) {

            //Swapping the elements
           int temp = Array[last];
           Array[last] = Array[start];
           Array[start] = temp;
           
           //Moving the pointers
           start++;
           last--;
        }
        System.out.print("The Reversed Array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i]+"  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter the size of array
        System.out.print("Enter the size of array-->");
        int size=sc.nextInt();

        //prompt the user to enter all the element of the array
        System.out.println("Enter all the elements of the array-->");
        int Array[]=new int[size];
        for (int i = 0; i < size; i++) {
            Array[i]=sc.nextInt();
        }

        // printing the user input array
        System.out.print("User Input Array is :");
        for (int i = 0; i < size; i++) {
            System.out.print(Array[i]+"  ");
        }

        ReverseArray(Array,size);
        sc.close();
    }
}
