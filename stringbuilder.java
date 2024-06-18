import java.lang.*;

public class stringbuilder {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb); // prints "helloworld"
        sb.insert(5,'-');
        System.out.println(sb);  //prints "hello-world"
        char[] arr={'j','a','v','a'};
        sb.insert(5,arr,1,3);
        System.out.println(sb);//prints "hellojava"
        sb.delete(5,8);
        System.out.println(sb);//prints "hello"
        sb.deleteCharAt(5);
        System.out.println(sb);//prints "hell"
        sb.reverse();
        System.out.println(sb);//prints "llhe"
        sb.replace(5,8,"jaddd");
        System.out.println(sb);//prints "helljd"
    }
}
