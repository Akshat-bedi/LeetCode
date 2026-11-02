class Solution {
    public void nextPermutation(int[] nums) {
        int index =-1;
        int n = nums.length;
        int temp;
        for(int i = n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){index =i; break;}
        }
        if(index ==-1){
            int i =0,j =n-1;
            while(i<j){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;   
            }
            return;
        }
        for( int i=n-1; i>index; i--){
            if(nums[i]>nums[index]){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        int j = n-1, i = index+1;
        while(i<j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
}