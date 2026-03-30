class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r =(height.length)-1;
        int area=0;
        while(l<r){
            int width= r-l;
            int h = Math.min(height[l], height[r]);
            int cur_area = width*h;
            area = Math.max(area,cur_area);
            if(height[l]<height[r]){
                l++;
            }
            else{
            r--;
            }
        }
        return area;   
    }
}