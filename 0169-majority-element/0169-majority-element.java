class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length/2;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num)>l)
            return num;
        }
        return 0;
    }
}