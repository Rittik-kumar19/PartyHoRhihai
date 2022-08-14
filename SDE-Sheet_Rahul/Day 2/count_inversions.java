public class Solution {
    public static long getInversions(long arr[], int n) {
        long[] temp = new long[n];
        long ans = mergeSort(arr, temp, 0, n-1);
        
        return ans;
    }
    
    public static long mergeSort(long[] arr, long[] temp, int left, int right) {
        int mid = 0;
        long inv_cnt = 0;
        
        if(left < right) {
            mid = (left+right)/2;
            
            inv_cnt = inv_cnt + mergeSort(arr, temp, left, mid);
            inv_cnt = inv_cnt + mergeSort(arr, temp, mid+1, right);
            
            inv_cnt = inv_cnt + merge(arr, temp, left, mid, right);  
        }
        
        return inv_cnt;
    }
    
    public static long merge(long[] arr, long[] temp, int left, int mid, int right) {   
        long cnt = 0;
        //arr is split into [l...mid] and [mid+1...r]
        int l = left;
        int k = left;
        int r = mid+1;
        
        while((l<=mid) && (r<=right)) {
            if(arr[l]<arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k++] = arr[r++];  
                //since we need to place right half element first, then this means all the elements in left half (including and after 'l' pointer are an inversion).
                cnt += mid-l+1;
            }
        }
        
        while(l<=mid) {
            temp[k++] = arr[l++];
        }
        
        while(r<=right) {
            temp[k++] = arr[r++];
        }
        
        for(int i=left; i<=right; i++) {
            arr[i] = temp[i];
        }
        
        return cnt;
        
    }
 }