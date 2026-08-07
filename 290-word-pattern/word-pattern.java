class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pat = pattern.toCharArray();
        String[] arr = s.split(" ");
        
        if(pat.length != arr.length) return false;

        HashMap<Character,String> m1 = new HashMap<>();
        HashMap<String,Character> m2 = new HashMap<>();

        for(int i = 0;i<pat.length;i++){
            if(!m1.containsKey(pat[i])){
                m1.put(pat[i],arr[i]);
            }
        }

        for(int j = 0;j<arr.length;j++){
            if(!m2.containsKey(arr[j])){
                m2.put(arr[j],pat[j]);
            }
        }

        for(int k = 0; k<pat.length;k++){
            if(!m1.get(pat[k]).equals(arr[k])) return false;
            if(!m2.get(arr[k]).equals(pat[k])) return false;
        }
        return true;
    }
}