package java17.Chapter_2_Operators;

public class Operator_Precedence {

    //java supports threee flavors of operators: unary, binary and ternary.

    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println( "Zoo animal receives: " +reward+ " reward points");

        // the multiplication operator (*) has a higher precedente.
        // the assignment operator (=) has the lowest order of precedente.

    }

}
