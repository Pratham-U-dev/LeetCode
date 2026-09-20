class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 97 + 1;
            int revindex = 27 - index;
            sum += (i+1) * revindex;
        }
        return sum;
    }
}