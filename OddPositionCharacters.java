
public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        printOddPositionCharacters(text);
    }

    public static void printOddPositionCharacters(String text) {
        // Remove white spaces from the string
        String trimmedText = text.replaceAll("\\s+", "");
        
        // Iterate through the string and print characters at odd positions
        for (int i = 0; i < trimmedText.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(trimmedText.charAt(i) + " ");
            }
        }
    }
}
