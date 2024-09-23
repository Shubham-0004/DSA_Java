
public class findSubsets {
    public static void findSubsets(String str , String ans,int i){
        //base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.print(ans+"  ");
            }
            return;
        }
        //recursion
        findSubsets(str, ans+str.charAt(i), i+1); //yes choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = new String("abc");
        String ans = new String("");
        findSubsets(str,ans,0);
    }
}
