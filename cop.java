import java.util.*;

public class cop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int c1 = 0;
        while (list.size() > 1) {
            Collections.sort(list);
            int a = list.get(0) + list.get(1);
            c1 += a;
            list.remove(0); // Remove the first element
            list.remove(0); // Remove the second element
            list.add(a); // Add the sum to the end of the list
        }
        System.out.println(c1);
    }
}
