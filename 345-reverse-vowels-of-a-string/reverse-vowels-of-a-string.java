class Solution {
    public String reverseVowels(String s) {
        Set<Character> arr = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        int i = 0;
        int j = s.length() - 1;
        // for(int l = 0;l,s.length();s++){
        //     if(!arr.contains)
        // }
        char[] st = s.toCharArray();
        while(i<j){
           while (i < j && !arr.contains(Character.toLowerCase(st[i]))) {
                i++;
            }
            while (i < j && !arr.contains(Character.toLowerCase(st[j]))) {
                j--;
            }
            if(i<j){
                char temp = st[i];
                st[i] = st[j];
                st[j] = temp;
                i++;
                j--;
            } 
        }
        return new String(st);
    }
}