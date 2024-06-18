import java.util.*;
class hashmap{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(10,"pranav");
        map.put(4,"jadhav");
        map.put(3,"pranav");
        map.put(3,"jadu");
        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<Integer,String> e: map.entrySet())
        {
            System.out.println(e.getKey());
        }
    }
}