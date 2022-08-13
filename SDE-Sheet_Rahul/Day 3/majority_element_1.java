class Solution {
    public int majorityElement(int[] nums) {
        int c=0,ele=0;
        for(int num:nums){
            if(c==0){
                ele=num;
            }
            if(ele==num){
                c++;
            }else{
                c--;
            }
        }
        return ele;
    }
}