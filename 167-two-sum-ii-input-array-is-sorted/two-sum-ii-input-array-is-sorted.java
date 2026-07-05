class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        int n = numbers.length;
        for(int i = 0;i < n - 1 ; i++){
            for(int j = i+1;j < n;j++){
                int sum = numbers[i] + numbers[j];
                if (sum > target){
                    break;
                }
                if(sum == target){
                    r[0] = i + 1;
                    r[1] = j + 1;
                }
            }
        }
        return r;
    }
}