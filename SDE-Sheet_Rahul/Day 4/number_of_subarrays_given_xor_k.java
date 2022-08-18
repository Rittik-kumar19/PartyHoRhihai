import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=0,xorr=0,n=arr.size();
        for(int i=0;i<n;i++){
            //prefix xor calculation
            xorr=xorr^arr.get(i);
            //y=xr^k
            //check for the value y already exist in map or not
            //if exists increase count
            if(mp.get(xorr^k)!=null)
                c+=mp.get(xorr^k);
            if(xorr==k)c++;
            if(mp.get(xorr)!=null)
                mp.put(xorr,mp.get(xorr)+1);
            else mp.put(xorr,1);
        }
        return c;
	}
}