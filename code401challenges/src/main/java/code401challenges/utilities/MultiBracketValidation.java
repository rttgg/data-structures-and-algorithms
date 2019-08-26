    package code401challenges.utilities;

    import java.util.Stack;

    public class MultiBracketValidation {

        public static boolean multiBracketValidation(String input) {
            //create a stack variable
            Stack<Character> openBracket = new Stack();
            for (int i = 0; i < input.length(); i++) {
                //Push openBrackets into a stack
                if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
                    openBracket.push(input.charAt(i));
                } else {
                    //Unmatched closedBrackets
                    if (openBracket.peek() == null) {
                        return false;
                    }
                    //Check if the open and close brackets matches
                    if (input.charAt(i) == ')' && openBracket.peek() != '(' ||
                            input.charAt(i) == ']' && openBracket.peek() != '[' ||
                            input.charAt(i) == '}' && openBracket.peek() != '{') {
                        return false;
                    } else {
                        //if the open and close brackets match pop brackets from the stack
                        openBracket.pop();
                    }
                }
                //if any unmatched bracket is left in the stack
                return openBracket.peek() == null;
            }
            return false;
        }

    }
