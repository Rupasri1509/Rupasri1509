public class cop3 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,0,0};
        int a=0,b=0,c=0;
        for (int i : arr){
            if (i==0) a++;
            else if(i==1) b++;
            else  c++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(a!=0)
            {
                arr[i]=0;
                a--;
            }
            else if(b!=0)
            {
                arr[i]=1;
                b--;
            }
            else
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
}
}