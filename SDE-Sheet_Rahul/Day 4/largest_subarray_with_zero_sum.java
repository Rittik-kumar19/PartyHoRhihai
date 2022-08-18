import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int maxi=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefSum=0;
        for(int i=0;i<arr.size();i++){
            prefSum+=arr.get(i);
            if(prefSum==0){
                maxi=i+1;
            }else{
                if(mp.get(prefSum)!=null){
                    maxi=Math.max(maxi,i-mp.get(prefSum));
                }else{
                    mp.put(prefSum,i);
                }
            }
        }
        return maxi;
    }
}