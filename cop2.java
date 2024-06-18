class cop2{
    public static int lcm(int b,int a)
    {
        for(int i=a;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                // System.out.println(i);
                return i;   
            }
        }
        return 0;
        
    }
    public static void main(String[] args)
    {
        int n=0,c=0;
        for(int i=1;i<=n;i++)
        {
            c+=((i*n)/lcm(i,n));
        }
        System.out.println(c);
    }
}