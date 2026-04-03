class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toRet = {1, 2};
        HashMap<Integer, Integer> indicesValueMapping = new HashMap<>();
        int diff = 0;
        int numsValue = 0;
        for(int i = 0; i < nums.length; i++){
            numsValue = nums[i];
            diff = target - numsValue;
            
            if(indicesValueMapping.containsKey(diff)) {
                return new int[] { indicesValueMapping.get(diff), i };
            }
            indicesValueMapping.put(numsValue, i);
        }

        return new int[] {};
    }
}
