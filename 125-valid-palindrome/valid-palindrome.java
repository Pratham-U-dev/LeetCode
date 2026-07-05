class Solution {
    public boolean isPalindrome(String s) {
        
        String r = s.toLowerCase().replaceAll("[^a-z0-9]","");
        
        int i = 0 , j = r.length() - 1;
        while(i<j){
            if(r.charAt(i) == r.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}