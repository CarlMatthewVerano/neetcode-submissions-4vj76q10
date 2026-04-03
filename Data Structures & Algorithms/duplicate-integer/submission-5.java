class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> placeholder = new HashMap();
        
        for (int i = 0; i < nums.length; i++) {
            if (!placeholder.containsKey(nums[i]))
                placeholder.put(nums[i], 1);
            else {
                placeholder.put(nums[i], placeholder.get(nums[i]) + 1);
                return true;
            }
        }

        return false;
    }
}