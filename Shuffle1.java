public class Shuffle1 {
    public static void main(String[] args) {
        // x is declared as 3
        int x = 3;

        // The loop begins with all conditions of x
        // being true. this means that x is obviously
        // greater than 0
        while (x > 0) {
            //So long as this condition is true
            //"a" will be printed.
            //the code then runs the decrement
            //before coming back into the other
            //nested conditions
            if (x > 2) {
                System.out.print("a");
            }
            //After running the whole loop, this
            //condition finally becomes true and
            //"b c" is printed
            if (x == 2) {
                System.out.print("b c");
            }
            //After the first condition, the decrement
            //is run next and "-" is printed
            x = x - 1;
            System.out.print("-");

            //After running all the nested conditions in the
            //previous loop, this condition is now targetted.
            //the decrement is handled here too, since the print
            //statement is not part of the other loop
            if (x == 1) {
                System.out.println("d");
                x = x - 1;
            }
        }
    }
}
