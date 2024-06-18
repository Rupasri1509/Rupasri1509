public class RemovePunctuation {
    public static void main(String[] args) {
        String text = "Anne,iI vote more car race Rome-to-Vienna";
        text.toLowerCase();
        // Create StringBuilder to store the result
        String str="",s1="";
        // Iterate over each character in the string
        for (int i = text.length()-1,j=0;i>=0; i--,j++) {
            char c = text.charAt(i);
            char c1 = text.charAt(j);
            if(Character.isAlphabetic(c1))
              s1=s1+c1;
            // Check if the character is an alphabet
            if (Character.isAlphabetic(c)) {
                // Append alphabetic characters and whitespaces to the StringBuilder
                str = str+c;
            }
        }
        System.out.println(s1);
        if(s1.equals(str))
          System.out.println("true");

        // Print the result
    }
}
