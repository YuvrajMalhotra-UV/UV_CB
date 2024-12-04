package lec15;

public class stringREVERSE {
    public static void main(String[] args) {
        // Original string
        String originalString = "OK ";
        
        // Split the string into words
        String[] words = originalString.split(" ");
        
        // Use StringBuilder to reverse the words
        StringBuilder reversedString = new StringBuilder();
        
        // Add words in reverse order to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" "); // Add space between words
            }
        }
        
        // Output the reversed string
        System.out.println(reversedString.toString());
    }

}
