class Solution {
    public int[] runningSum(int[] nums) {        
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];       
        }
        return nums;        
    }
}
//we did inplace array manipulation here num[i] & num[i-1] are the values of new array 
