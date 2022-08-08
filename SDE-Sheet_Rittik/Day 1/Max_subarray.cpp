//bruteForce
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        int mx=nums[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+nums[k];
                }
                mx=max(sum,mx);
            }
        }
        return mx;
    }
};

//Optimized
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curr_max=nums[0];
        int mx_so_far=nums[0];
        for(int i=1;i<nums.size();i++){
            curr_max=max(nums[i],curr_max+nums[i]);
            mx_so_far=max(mx_so_far,curr_max);
        }
        return mx_so_far;
    }
};