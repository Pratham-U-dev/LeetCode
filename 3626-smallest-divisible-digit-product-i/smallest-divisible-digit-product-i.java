class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag = true;
        int res = 0;
        while(flag){
            
            int prod=1;
            int temp = n;
            while(temp!=0){
            int dig = temp%10;
            prod *= dig;
            temp = temp/10;
        }
        if(prod % t == 0){
            res = n;
            flag = false;
        } 
        else n++;
        }
        return res;
    }
}