
import java.lang.*;
class operation {
    public static void main(String[] args)
    {
        String str = "hello pranav";
        String str2="heLlo pranav";
        String str3,str4;
        System.out.println(str3=str.concat(" ").concat(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str4=str3.substring(5,18));
        System.out.println(str4.trim());
        System.out.println(str.indexOf("l"));
        System.out.println(str2.replace("heLlo","Jadhav"));

        String s="hello , hello , pranav";
        int index=s.indexOf("h");
        while(index!=-1)
        {
            System.out.println("Found at : "+index);
            index=s.indexOf("h",index+1);
        }
        System.out.println(s.lastIndexOf("h"));

        String s1="jranad";
        String s2="dranav";
        System.out.println(s1.compareTo(s2));

        String s3="hello helloworld pranav";
        String[] arr = s3.split(" ");
        System.out.println(arr[2]);
        char[] arr1 = s3.toCharArray();
        System.out.println(arr1[4]);

        String str5="Pranav";
        String str6=str5.Insert(0,"Mr.");
        System.out.println(str6);


    }
}