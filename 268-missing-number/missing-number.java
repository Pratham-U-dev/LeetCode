class Solution {
    public int missingNumber(int[] nums) {
        int max = 0;
        int min = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ;i<nums.length;i++){
            set.add(nums[i]);
            max = Math.max(max,nums[i]);
            min = Math.min(max,nums[i]);
        }
        for(int j = 0; j<=nums.length;j++){
            if(!set.contains(j)) return j;
        }
        return -1;
    }
}