int majorityElement(int* nums, int numsSize) {
    //int ele = numSize/2;
    int c = 0 ;
    int cand = 0;

    for(int i=0;i<numsSize;i++){
         if(c == 0){
            cand = nums[i];
         }
         c += (nums[i]==cand) ? 1 : -1;
    }
    return cand;
}