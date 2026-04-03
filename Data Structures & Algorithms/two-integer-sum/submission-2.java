class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mappedList = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            mappedList.put(nums[i], i);
        }

        int difference = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        int secondIndexMap;

        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            System.out.println("Difference: " + difference);
            System.out.println("Target: " + target);
            System.out.println("Nums: " + nums[i]);
            if(mappedList.containsKey(difference)){
                System.out.println("HERE");
                firstIndex = i;
                secondIndex = mappedList.get(difference);
                System.out.println("2ND INDEX " + secondIndex);
                if(firstIndex != secondIndex)
                    break;
                else
                    continue;
            }
        }
        
        int ans[] = {firstIndex, secondIndex};

        return ans;
    }
}
