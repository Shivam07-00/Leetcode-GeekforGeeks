class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int j = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j] = nums[i+1];
                j++;
                k++;
            }
        }
        return k;
        
    }
}