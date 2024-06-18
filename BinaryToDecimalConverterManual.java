import java.util.Scanner;

public class BinaryToDecimalConverterManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        int N=binaryNumber.length();
        int decimal=0;
        // Convert binary to decimal using manual method
        for(int i=0;i<binaryNumber.length();i++)
        {
            if(binaryNumber.charAt(i)=='1')
            {
                decimal+=Math.pow(2,N-1);

            }
            N--;
        }
        System.out.println(decimal);
    }
}