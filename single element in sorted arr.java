Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
public int singleNonDuplicate(int[] nums) {
        int n=nums.length-2;
        int l=0,h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid%2==0){
                if(nums[mid]!=nums[mid+1])
                 h=mid-1;
                 else
                 l=mid+1;
            }
            else{
                if(nums[mid]==nums[mid+1])
                h=mid-1;
                 else
                 l=mid+1;

            }
        }
        return nums[l];
    }
