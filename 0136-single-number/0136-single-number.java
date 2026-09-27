class Solution {
    public int singleNumber(int[] nums) {
       int l=nums.length;
        HashSet <Integer> set = new HashSet<>();
        for (int i=0;i<l;i++)
        {
            int num=nums[i];
            if (set.contains(num))
            set.remove(num);
            else 
            set.add(num);
        }

        for ( int num:set)
        {
            return num;
        }
        return -1;
        
    }
}