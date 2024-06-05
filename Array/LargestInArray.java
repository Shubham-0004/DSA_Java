import java.util.Scanner;
public class LargestInArray {
    public static int Find_Largest(int largest[]){
        int temp = 0;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i]>temp) {
                temp=largest[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array-->");
        int n=sc.nextInt();
        int largest[]=new int[n];
        System.out.println("Enter all the elements of the array:");
        for (int i = 0; i < largest.length; i++) {
            largest[i]=sc.nextInt();
        }
        int largest_in_array=Find_Largest(largest);
        System.out.print("The largest element of the array is:"+largest_in_array);
        sc.close();
    }
}

