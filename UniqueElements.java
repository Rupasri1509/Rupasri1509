import java.util.HashSet;
import java.util.Set;

public class UniqueElements{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 9};

        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : array) {
            uniqueSet.add(num);
        }

        System.out.println("Unique elements in the array: " + uniqueSet);
    }
}
 
