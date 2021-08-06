class Solution {
     // o(n**2) 
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
     
     // Can you come up with an algorithm that is less than O(n2) time complexity?
     // working on it 
     // o(n) linear using Hash Map
    
    
        HashMap < Integer, Integer> lis = new HashMap<>();
        for(int i =0; i<nums.length; i++)
        {
            int result = target - nums[i];
            if(lis.containsKey(result))
            {
                return new int [] {lis.get(result), i};
            }
            lis.put(nums[i], i);
        }
        
        throw new IllegalArgumentException(" ");
    
       }
    
}

