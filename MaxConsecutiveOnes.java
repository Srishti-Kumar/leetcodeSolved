class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {       
        int maxvalue=0, count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxvalue=Math.max(maxvalue,count);
            }
            else
                count=0;
        }
        return maxvalue;  
    }
}
