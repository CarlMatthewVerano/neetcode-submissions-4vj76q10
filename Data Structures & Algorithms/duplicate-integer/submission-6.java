class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet();
        for(Integer num : nums) {
            if(list.contains(num))
                return true;
            else
                list.add(num);
        }
        return false;
    }
}