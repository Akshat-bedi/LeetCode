class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int compliment;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            compliment = target - nums[i];
            
            if(map.containsKey(compliment) && map.get(compliment) != i){
                return new int[] {i,map.get(compliment)};
            }
        }
        return new int[]{};
    }
}