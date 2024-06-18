import java.io.*;
import java.util.*;
public class q11 {
    public static int min(int a[],int b[])
    {
        int min=a[0];
        int pos=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                pos=i;
                min=a[i];
            }
        }
        return pos;

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        int f=(n-1)*4;
        int[] pos=new int[f];
        int k=0;
        int[] num=new int[f];
        int l=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || j==n-1 || i==n-1)
                {
                    num[k]=arr[i][j];
                    k++;
                    int i1=i,j1=j;
                    String ss=(Integer.toString(i1))+(Integer.toString(j1));
                    pos[l]=Integer.parseInt(ss);
                    l++;
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(pos[i]+" ");
        }
        int pos1=min(num,pos);
        int sh=(n*n)/4;
        int[] temp = new int[k];
        System.arraycopy(num, k-sh, temp, 0, sh);
        System.arraycopy(num,0,num,sh,k-sh);
        System.arraycopy(temp,0,num,0,sh);
        for(int i=0;i<k;i++)
        {
            System.out.println(num[i]+" ");
        }
    }
    
}
