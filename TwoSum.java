class Solution {
     // Can you come up with an algorithm that is less than O(n2) time complexity?
     // working on it 
    public int[] twoSum(int[] nums, int target) {
        int array [] = new int[2];
        for(int x = 0; x < nums.length; x++)
        {
            for(int y = x + 1; y < nums.length; y++)
            {
                if (nums[x] + nums[y] == target)
                {
                    array[0] = x;
                    array[1] = y;
                }
            }
        }
        return array;
        
    }
    
}

