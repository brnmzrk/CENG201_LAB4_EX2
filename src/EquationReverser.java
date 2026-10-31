/**
 - EquationReverser.java
 - Your Name:        _________________
 - Your Student ID:  _________________
 - Your Date:        _________________
 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?
        // Answer: Because it doesn't require any instance state or variables of the 
        // EquationReverser class. It only operates on the passed 'equation' parameter 
        // and can be called directly using the class name.

        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;
        int n = equation.length();

        // TODO 1: Traverse the equation from left to right.
        // Push numbers and operators onto the stack.
        while (i < n) {
            char c = equation.charAt(i);

            // TODO 2: If the current character is a digit,
            //         Remember the beginning of the number and Move forward until the number ends.
            // Push the whole number as one item.
            if (Character.isDigit(c)) {
                int start = i;
                while (i < n && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String numberStr = equation.substring(start, i);
                stack.push(numberStr);
            }
            // TODO 3: Otherwise, push the operator.
            else {
                stack.push(String.valueOf(c));
                i++;
            }
        }

        // TODO 4: Pop all items from the stack and append
        //         them to a StringBuilder. (Pop items to construct the reversed equation.)
        // StringBuilder = new StringBuilder() creates an empty builder. Each append() adds a character to it.
        StringBuilder reversedBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedBuilder.append(stack.pop());
        }

        return reversedBuilder.toString();
    }
}