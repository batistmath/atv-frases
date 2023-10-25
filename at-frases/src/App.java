import java.util.Stack;
public class App {
    public static String revertePalavras(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(revertePalavra(word)).append(" ");
        }
        return result.toString().trim();
    }
    private static String revertePalavra(String word) {
        Stack<Character> charStack = new Stack<>();
        for (char c : word.toCharArray()) {
        charStack.push(c);
        }
        StringBuilder revertePalavra = new StringBuilder();
        while (!charStack.isEmpty()) {
            revertePalavra.append(charStack.pop());
        }
        return revertePalavra.toString();
    }
    public static void main(String[] args) {
        String input = "WANDERSON RODRIGO";
        String reversed = revertePalavras(input);
        System.out.println(reversed);
    }
    
}
