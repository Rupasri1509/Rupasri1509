class reference1{
    int a=10;
}
public class reference {
    public static void main(String[] args){
    reference1 r1 = new reference1();
    r1.a=30;
    reference1 r2 = new reference1();
    r2=r1;
    System.out.println(r2.a);
    }
}
