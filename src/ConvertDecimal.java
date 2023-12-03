import java.util.Stack;

public class ConvertDecimal {
    public static String convertToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            int last = decimal % 2;
            stack.push(last);
            decimal /= 2;
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
    public static void main(String[] args) {


        int[] decimalNumbers = { 5, 6, 13, 30, 100 };

        for (int num : decimalNumbers) {
            System.out.println(num + " in binary: " + convertToBinary(num));
        }



    }
}
