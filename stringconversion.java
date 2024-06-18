public class stringconversion {
    public static void main(String[] args)
    {
        System.out.println(Integer.parseInt("1111",2));
        System.out.println(Integer.parseInt("1AF",16));
        System.out.println(Integer.parseInt("567",8));
        System.out.println(Integer.parseInt("1101",10));
        int x=8;
        String s = Integer.toBinaryString(x);
        System.out.println(s);

    
    }
}
