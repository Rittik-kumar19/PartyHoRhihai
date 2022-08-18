class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int nums[],int low,int high){
        if(low>=high)return 0;
        int mid=(low+high)/2;
        //Split merge
        int inv=mergeSort(nums,low,mid);
        inv+=mergeSort(nums,mid+1,high);
        
        //merge altogether
        inv+=merge(nums,low,mid,high);
        
        return inv;
    }
    public int merge(int nums[],int low,int mid,int high){
        int cnt=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>2*(long)nums[j]){
                j++;
            }
            cnt+=(j-(mid+1));
        }
        ArrayList<Integer> l=new ArrayList<>();
        int left=low;
        int right=mid+1;
        //merge
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                l.add(nums[left++]);
            }else{
                l.add(nums[right++]);
            }
        }
        //if any is left
        while(left<=mid){
            l.add(nums[left++]);
        }
        while(right<=high){
            l.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=l.get(i-low);
        }
        return cnt;
    }
}