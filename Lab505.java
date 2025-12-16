import javax.swing.JOptionPane;
public class Lab505 {
    public static boolean is_palindrome(String word) {
        String lowerCaseWord = word.toLowerCase();
        String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
        return lowerCaseWord.equals(reversedWord);
    }

    public static void main(String[] args) {
        String inputWord = JOptionPane.showInputDialog(null, "Enter some word:", "Input", JOptionPane.QUESTION_MESSAGE);

        if (inputWord == null) {
            return;
        }

        boolean isPalindrome = is_palindrome(inputWord);

        String message;
        if (isPalindrome) {
            message = inputWord + " is Palindrome";
        } else {
            message = inputWord + " is not Palindrome";
        }
        
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
