class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<Integer>();
        for(int num:nums){
            st.add(num);
        }
        int longestStreak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currNum+=1;
                    currStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currStreak);
            }
        }
        return longestStreak;
    }
}