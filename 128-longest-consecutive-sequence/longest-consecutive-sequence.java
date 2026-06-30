class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        int longStreak = 0;

        for (int num : numSet){

            if(!numSet.contains(num-1)){
                int currNum = num;
                int Streak = 1;

                while(numSet.contains(currNum + 1)){
                    currNum++;
                    Streak++;
                }
                longStreak = Math.max(longStreak,Streak);
            }
        }
        return longStreak;
    }
}