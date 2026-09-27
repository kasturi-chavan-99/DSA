class Solution {
    public double myPow(double x, int n) {
        double mul =1.0; 
        long nn=n;
        if (nn<0) nn=nn*-1;

        while (nn>0)
        {
            if (nn%2==1)
            {
                mul*=x;
                nn--;
            }
            else 
            {
                x=x*x;
                nn/=2;
            }
        }
        if (n>0) return (double)mul;
        else return 1/mul;
    }
}