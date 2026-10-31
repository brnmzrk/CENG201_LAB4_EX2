/**
 - ReverseEquationDemo.java
 */

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "123+45*6",
                "100/25-7"
        };

        // Print the input and output like in the expected output
        for (String eq : equations) {
            String reversed = EquationReverser.reverseEquation(eq);
            System.out.println("Original: " + eq + " -> Reversed: " + reversed);
        }
    }
}