class Solution {
    public int missingInteger(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            set.add(num);
        }
        int sum = nums[0];
        for(int i=1;i<n && nums[i] == nums[i-1]+1;i++){
            sum+=nums[i];
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}