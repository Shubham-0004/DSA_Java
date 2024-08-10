import java.util.*;
public class shortestpath {
    public static float shortestpath(String path){
        int n=path.length();
        int x=0;
        int y=0;
        for (int i = 0; i < n; i++) {
            char dir=path.charAt(i);
            if (dir=='W' || dir=='w') {
                x--;
            }else if (dir=='E' || dir=='e') {
                x++;
            }else if (dir=='N'||dir=='n') {
               y++;
            }else{
                y--;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the path in form of WENS only where W->West,E->East,N->North,S->South.");
    String path= sc.nextLine();
    System.out.println("given path is :"+path);

    float result =shortestpath(path);
    System.out.println("The shortest distance for given path is "+result);
   } 
}
