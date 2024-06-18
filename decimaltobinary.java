import java.util.*;
public class decimaltobinary {
    public static void main(String[] args)
    {
        int[] a =new int[302];
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        while(n>0)
        {
            
            a[i]=n%2;
            i++;
            n/=2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
}
