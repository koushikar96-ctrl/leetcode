class Solution {
    public int maxProduct(int[] nums) {
        int currmin=nums[0];
        int currmax=nums[0];
        int max=nums[0];
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            if(x<0){
                int temp = currmax;
                currmax=currmin;
                currmin=temp;
            }
            currmax=Math.max(x,currmax*x);
            currmin=Math.min(x,currmin*x);
            max=Math.max(max,currmax);
        }
        return max;
        
    }
}