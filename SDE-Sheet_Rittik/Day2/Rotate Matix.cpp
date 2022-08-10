//Transerve + reverse
class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i].begin(),matrix[i].end());
        }
    }
};
//
https://leetcode.com/problems/rotate-image/discuss/1449737/Rotation-90Code-180-270-360-explanation-Inplace-O(1)-Space

For all angle rotation in the multiple of 90
