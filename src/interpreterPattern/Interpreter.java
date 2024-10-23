package interpreterPattern;

public class Interpreter {
    public static int interpret(String input) {
        String[] tokens = input.split(" ");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }

        return result;
    }
}