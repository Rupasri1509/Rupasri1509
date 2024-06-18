 import java.io.*;
import java.util.*;
public class sam2{
    public static void main(String[] args) {
        String word1="ab";
        String word2="pq";
        int l1=word1.length();
        int l2=word2.length();
        int len=l1+l2;
        int d=l1-l2;
        int p1=0,p2=0;
        String c=" ";
        String m=" ";
        if(d>0){
            len=l2;
            p1=l2;
            p2=l1;
            c=word1;
        }
        else if(d<0){
            len=l1;
            p1=l1;
            p2=l2;
            c=word2;
        }
        for(int i=0;i<len;i++){
            if(i%2==0){
                m+=word1.charAt(i);
            }
            else{
                m+=word2.charAt(i);
            }
        }
        if(p1!=0 && p2!=0){
        for(int i=p1;i<p2;i++){
            m+=c.charAt(i);
        }
    }
        System.out.println(m);
    }
 
}
