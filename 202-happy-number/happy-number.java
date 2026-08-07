class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int sum=0;
            int val =n;
            while(val!=0){
            int dig = val%10;
            sum += dig * dig;
            val=val/10;
            }
            n = sum;
        }
        return n==1;
    }
}