//Approach : Dynamic Programming
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return countPaths(0,0,m,n,dp);
    }
    int countPaths(int i,int j,int m,int n,int dp[][]){
        if(i>=m || j>=n)return 0;
        if(i==(m-1) && j==(n-1))return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
        return dp[i][j];
    }
}

//Approach : nCr
class Solution {
    public int uniquePaths(int m, int n) {
        //combinatorics
        int N=m+n-2;
        int r=m-1;
        double ans=1.00;
        for(int i=1;i<=r;i++){
            ans=ans*(N-r+i)/i;
        }
        return (int)(ans);
        
    }
}