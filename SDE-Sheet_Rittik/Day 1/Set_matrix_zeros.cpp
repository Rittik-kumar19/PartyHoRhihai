class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<pair<int,int>>vp;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                if(matrix[i][j]==0){
                    vp.push_back({i,j});
                }
            }
        }
        for(int i=0;i<vp.size();i++){
            for(int j=0;j<matrix.size();j++){
                matrix[j][vp[i].second]=0;
            }
        }
        for(int i=0;i<vp.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                matrix[vp[i].first][j]=0;
            }
        }
        
    }
};