class array {
    public static void main() {
        int
        int[] arr = new int[m+n];
        if(n==0)
        {
            System.arraycopy(arr,0,nums1,0,m-1);
        }
        else if(m==0)
        {
            System.arraycopy(arr,0,nums2,0,n-1);
        }
        else
        {
        System.arraycopy(arr,0,nums1,0,m-1);
        System.arraycopy(arr,m,nums2,0,n-1);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);
    }
}