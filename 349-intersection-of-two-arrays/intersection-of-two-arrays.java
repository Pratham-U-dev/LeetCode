class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        List<Integer> arr = new ArrayList<>();

        for(int j = 0;j<nums2.length;j++){
            if(set.contains(nums2[j]) && !set1.contains(nums2[j])){
                set1.add(nums2[j]);
                arr.add(nums2[j]);
            }
        }
        int[] res = new int[arr.size()];
        for(int k = 0;k<arr.size();k++){
            res[k] = arr.get(k);
        }
        return res;
    }
}