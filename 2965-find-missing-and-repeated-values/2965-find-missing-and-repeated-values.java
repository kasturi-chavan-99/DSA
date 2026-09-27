class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        
        int ans[] = new int [2];
        
        int num ;
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<m;i++)
        {
            for (int j = 0 ; j<m;j++)
            {
                num=grid[i][j];
                map.put (num, map.getOrDefault(num,0)+1);
                if (map.get(num)>1)
                ans[0]=num;
            }

        }

        for (int i=0;i<=(m*m);i++)
        {
            if (!map.containsKey(i))
            ans[1]=i;
        }
        return ans;
    }
}