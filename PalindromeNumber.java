import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
       String s = String.valueOf(x);
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        // print reversed String
        //System.out.println(input1);
        String s2 = input1.toString();
        return s.equals(s2);

    }
}
