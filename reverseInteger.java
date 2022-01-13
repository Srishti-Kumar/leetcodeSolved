class Solution {
    public int reverse(int x) {
        if(x<10 && x>-10) {
            return x;
        }
        long reversed = 0;
        while(x != 0) {
           int digit = x % 10;
           reversed = reversed * 10 + digit;
           x /= 10;
        }
        return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int) reversed;

    }
        
    
}
