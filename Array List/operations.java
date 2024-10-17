import java.util.*;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);
        list.add(2,6);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.size());

        //store elements in array list using loops
        for (int i = 0; i<=10; i++) {
            
                list.add(i);
            
        }
        //printing them
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
}
}