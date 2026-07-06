class Solution {
    public int digitFrequencyScore(int n) {
        String s = Integer.toString(n);
        int[] freq = new int[10];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - '0']++;
        }
        
        int score = 0;
        for (int d = 0; d < 10; d++) {
            score += d * freq[d];
        }
        
        return score;
    }
}
