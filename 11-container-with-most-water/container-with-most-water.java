class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while(start<end){
            int prod = (end - start) * Math.min(height[start],height[end]);
            if(prod>max){
                max = prod;
            }
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}