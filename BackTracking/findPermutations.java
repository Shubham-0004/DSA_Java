
public class findPermutations {
    public static void findPermutations(String str,String ans){
        // base case
        if (str.length()==0) {
            System.out.print(ans+"  ");
            return; 
        }
        //recursions
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // abcde = "ab"+"de";
            String newStr= str.substring(0, i)+str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = new String("abc");
        String ans = new String("");
        findPermutations(str,ans);
    }
}
