import java.util.*;
public class sample3{

    public static int findSmallestGreaterNumber(int number) {
        if (number >= 10000 || number < 1000) {
            throw new IllegalArgumentException("Number must be a 4-digit number.");
        }

        // Convert the number to an array of digits.
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Check if the number already has distinct digits.
        if (hasDistinctDigits(digits)) {
            return -1; // No larger number with distinct digits exists.
        }

        // Find the first digit that is not the largest.
        int i = 0;
        while (i < 3 && digits[i] >= digits[i + 1]) {
            i++;
        }

        // If no such digit is found, there is no larger number with distinct digits.
        if (i == 3) {
            return -1;
        }

        // Swap the digit at index i with the next largest digit.
        int j = i + 1;
        while (j < 4 && digits[j] <= digits[i]) {
            j++;
        }
        swap(digits, i, j - 1);

        // Sort the remaining digits in descending order.
        Arrays.sort(digits, i + 1, 4);

        // Convert the array of digits back to a number.
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;
    }

    private static boolean hasDistinctDigits(int[] digits) {
        boolean[] seen = new boolean[10];
        for (int digit : digits) {
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int number = 1000;
        int result = findSmallestGreaterNumber(number);
        if (result != -1) {
            System.out.println("The smallest 4-digit number greater than " + number + " with distinct digits is " + result);
        } else {
            System.out.println("There is no 4-digit number greater than " + number + " with distinct digits.");
        }
    }
}