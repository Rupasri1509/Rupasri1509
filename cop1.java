import java.util.*;
public class cop1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
