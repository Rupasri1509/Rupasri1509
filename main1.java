import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int array[]=new int[len];
        for (int i = 0; i <array.length ;i++) {
            array[i]=in.nextInt();}
        List<Integer> resultList = new ArrayList<>();
        
        // Sort the array
        Arrays.sort(array);
        
        // Iterate through the array
        int solution=0;
        for (int i = 0; i < array.length; i++) {
            // Check if the absolute difference between current and next element is less than or equal to 1
            if (i < array.length - 1 && Math.abs(array[i] - array[i + 1]) <= 2) {
                // Skip both elements
                i++;
                solution++;
            } else {
                // Add the current element to the result list
                resultList.add(array[i]);
            }
        }
        
        // Convert List to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        System.out.println(solution+result.length);
    }
}