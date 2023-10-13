import java.util.HashSet;

public class code3 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {

        String lowercaseInput = s.toLowerCase();

        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            if (Character.isLetter(currentChar) && !letters.contains(currentChar)) {
                letters.add(currentChar);
            }
        }

        return letters.size() == 26;
    }
}
