class Solution {
    public int majorityElement(int[] nums) {
        int el = -1;
        int cnt = 0;
        for(int i = 0; i< nums.length; i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}