import java.io.*;
import java.util.*;
class main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s=Integer.toString(n);
        if(s.charAt(1)==s.charAt(2))
        {
            System.out.println("Bad");
        }
        else
        {
            System.out.println("Good");
        }
    }
}