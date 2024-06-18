public class cop4 {
    public static void main(String[] args)
    {
        int arr[][]={
            {1,0,0},{0,1,0},{0,0,1}
        };
        int mul[][] = new int[10][10];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    mul[i][j]+=arr[i][k]*arr[k][j];
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mul[i][j]);
            }
        }
    }
}
