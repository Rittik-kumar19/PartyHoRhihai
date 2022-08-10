vector<int> Solution::repeatedNumber(const vector<int> &nums) {
       int n = nums.size();
       int XOR = 0;
       for(int i=0;i<n;i++){
           XOR^=nums[i];
       }
       for(int i=1;i<=nums.size();i++){
           XOR^=i;
       }
        // cout<<XOR<<endl;
       int rbs = (XOR & (-XOR));
        // cout<<rbs<<endl;
        int x = 0;
        int y = 0;
       for(int val:nums){
           if((val & rbs)==0){
               x^=val;
           }
           else{
               y^=val;
           }
       }
       for(int i=1;i<=nums.size();i++){
           if((i & rbs)==0){
               x^=i;
           }
           else{
               y^=i;
           }
       }
        // cout<<x<<" "<<y<<endl;
        int ans = 0;
       for(int i=0;i<nums.size();i++){
           if(nums[i]==x){
               ans = x;
               break;
           }
           else if(nums[i]==y){
               ans = y;
               break;
           }
       }
       int mans = 0;
       if(x==ans){
           mans = y;
       }
       else if(y==ans){
           mans = x;
       }
    vector<int>anss;
    anss.push_back(ans);
    anss.push_back(mans);
    return anss;
}
