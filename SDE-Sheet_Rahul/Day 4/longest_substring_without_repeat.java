class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Map of <char,int> char--character ,int--last appeared index
        Map<Character,Integer> mp=new HashMap<>();
        int left=0,right=0,len=0,n=s.length();
        while(right<n){
            if(mp.containsKey(s.charAt(right))){
                //left jump
                //comparison of left and last seen index
                left=Math.max(mp.get(s.charAt(right))+1,left);
            }
            mp.put(s.charAt(right),right);
            len=Math.max(len,(right-left+1));
            right++;
        }
        return len;
    }
}