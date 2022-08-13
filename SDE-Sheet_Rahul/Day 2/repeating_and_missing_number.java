import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int res[]=new int[2];
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr.get(i)]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)res[1]=i;
            if(freq[i]==0)res[0]=i;
        }
        return res;
    }
}