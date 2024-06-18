import java.lang.*;

public class palindrome {
    public static void main(String[] args)
    {
        String s1="malayaalam";
        int l=0;
        int r=s1.length()-1;
        while(l<r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
            {
                System.out.println("The given string is not a palindrome");
            }
            l++;
        r--;
            }
    }
}
