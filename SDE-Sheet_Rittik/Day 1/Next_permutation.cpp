class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        // next_permutation(nums.begin(),nums.end());
          int len=nums.size(), k=0, l=0;
        for(k=len-2;k>=0;k--){
            if(nums[k]<nums[k+1])
                break;
        }
        if(k<0){
            reverse(nums.begin(),nums.end());
        }
        else{
            for(l=len-1;l>k;l--){
                if(nums[l]>nums[k])
                    break;
        }
            swap(nums[k],nums[l]);
            reverse(nums.begin()+k+1,nums.end());
        }
    }
};

//Striever k video given in 4 steps
/*
1.arr[i]<arr[i+1] ->from last . take it as index1
2.from last check whick is greater than arr[ind1] --> take it as ind2
3.swap (ind1,ind2)
4.reverse(nums.begin()+k+1,nums.end());



*/