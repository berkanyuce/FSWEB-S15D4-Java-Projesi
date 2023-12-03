import java.util.Locale;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesChallenge {
    public static void main(String[] args) {
        String input1 = "I did, did I?";
        String input2 = "Racecar";
        String input3 = "hello";
        String input4 = "Was it a car or a cat I saw ?";

        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));
        System.out.println(isPalindrome(input4));
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        while (!stack.isEmpty()) {
            if(!stack.pop().equals(queue.poll())) return false;
        }
        return true;
    }
}
