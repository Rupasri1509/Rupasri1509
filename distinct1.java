import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class distinct1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
        String str2 = in.next();
        String str1 = in.next();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (Character s : str1.toCharArray())
                map1.put(s, 1);
        for (Character s : str2.toCharArray()) {
            if (map2.containsKey(s)) {
                int val = map2.get(s) + 1;
                map2.put(s, val);
            } else {
                map2.put(s, 1);
            }
        }
        int temp = 0;
        for (Character name : map1.keySet()) {
            if (map2.containsKey(name)) {
                temp += map2.get(name);
            }
        }
        System.out.println(temp);
        }
    }
}