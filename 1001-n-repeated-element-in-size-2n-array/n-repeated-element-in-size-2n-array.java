class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        int rep =0,res=0;
        for(int val : map.values()){
            rep = Math.max(rep , val);
        }
        for(int v :map.keySet()){
            if(map.get(v)==rep){
                res = v;
            }
        }
        return res;
    }
}