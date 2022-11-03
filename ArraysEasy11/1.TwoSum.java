import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(nums[i])){
                int index1 = hmap.get(nums[i]);
                result[0] = index1;
                result[1] = i;
                
            }else{
                hmap.put(target - nums[i],i); //7,0
            }
        }
    }
} 
