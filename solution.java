import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String[] s2 = s1.split(",");
        
        if (s2.length != 6) {
            System.out.println("Invalid input format. Please provide six values separated by commas.");
            return;
        }

        int c = 0;
        String s3 = s2[5].trim();  // Trim to remove leading/trailing whitespaces
        System.out.println(s3);

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(s2[i].trim());  // Trim to remove leading/trailing whitespaces

            if (s3.equals(""Odd"" && n % 2 != 0) {
                c++;
            } else if (s3.equals("Even") && n % 2 == 0) {
                c++;
            }
        }

        System.out.println(c);
    }
}
