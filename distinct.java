import java.util.Arrays;
import java.util.Scanner;
public class distinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sumOfMedians = 0;
        int n = arr.length;
        while (n > 0) {
            if (n % 2 == 1) {
                sumOfMedians += arr[n / 2];
                arr[n/2]=999;
                Arrays.sort(arr);
            } else {
                sumOfMedians += (arr[n / 2 - 1] + arr[n / 2]) / 2;
                if(arr[n/2-1]>arr[n/2])
                arr[n/2]=999;
                else
                arr[n/2-1]=999;
                Arrays.sort(arr);
            }
            n--;
        }
        System.out.println(sumOfMedians);
    }
}