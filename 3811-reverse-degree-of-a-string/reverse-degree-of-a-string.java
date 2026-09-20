class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                int index = ch - 97 + 1;
                int revindex = 27 - index;
                sum += (i+1) * revindex;
                map.put(ch,revindex);
            }
            else{
                sum+= (i+1) * map.get(ch);
            }
            
        }
        return sum;
    }
}