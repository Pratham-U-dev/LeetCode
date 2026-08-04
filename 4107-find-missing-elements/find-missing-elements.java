class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();;
        Set<Integer> s = new HashSet<>();
        int min=nums[0],max=0;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            s.add(nums[i]);
        }

        for(int j=min;j<max;j++){
            if(!s.contains(j)){
                res.add(j);
            }
        }
        return res;
    }
}