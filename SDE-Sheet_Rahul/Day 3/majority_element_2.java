//Approach : HashMap
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int m=n/3;
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else mp.put(nums[i],1);
        }
        for(Integer i:mp.keySet()){
            if(mp.get(i)>m)l.add(i);
        }
        return l;
    }
}
//Approach : Boyer Moore Voting Algo
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=Integer.MAX_VALUE,num2=Integer.MIN_VALUE,c1=0,c2=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==num1)c1++;
            else if(nums[i]==num2)c2++;
            else if(c1==0){
                num1=nums[i];
                c1=1;
            }
            else if(c2==0){
                num2=nums[i];
                c2=1;
            }else{
                c1--;c2--;
            }
        }
        c1=0;c2=0;
        List<Integer> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==num1)c1++;
            if(nums[i]==num2)c2++;
        }
        if(c1>n/3)ans.add(num1);
        if(c2>n/3)ans.add(num2);
        return ans;
    }
}