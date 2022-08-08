class Solution {
public:
    vector<vector<int>> generate(int n) {
       vector<vector<int>>ans;
        if(n==0){
            return ans;
        }
       ans.push_back({1});
       if(n==1){
           return ans;
       }
       else{
           for(int i=1;i<n;i++){
               vector<int>v;
               for(int j=0;j<=i;j++){
                   int res = 1;
                   for(int k=0;k<j;k++){
                           res = res*(i-k);
                           res = res/(k+1);
                       }
                   v.push_back(res);
               }
               ans.push_back(v);
               v.clear();
           }
       }
        return ans;
    }
};

//class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>r(numRows);
        for(int i=0;i<numRows;i++){
            r[i].resize(i+1);
            r[i][0]=r[i][i]=1;
            for(int j=1;j<i;j++){
                r[i][j]=r[i-1][j-1]+r[i-1][j];
            }
        }
        return r;
    }
};
/*
here three types generally asked in interview:
1.print pascal triangle
2.print particular element
3.print particular row
*/