import java.util.*;
class leet4 {
    public static void main(String[] args) {
        int k=0,k1=0,op=0;
        int[] nums = {2,3,2,2,2,3,3,4,4,};
        Arrays.sort(nums);
        int[] count=new int[nums.length];
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                c++;
                else
                break;
            }
            if(c>0)
            {
                i=i+c-1;
            }
            count[k]=c;
            k++;
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(count[i]);
        }
        for(int i=0;i<k;i++)
        {
            if(count[i]%2==0)
            {
                op=op+count[i]/2;
            }
            else if(count[i]%3==0)
            {
                op=op+count[i]/3;
            }
            else
            {
                System.out.println(-1);
            }
        }
        System.out.println(op);

    }
}