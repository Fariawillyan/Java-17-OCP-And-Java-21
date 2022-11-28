import java.util.Random; // import tells us where to find Random // Can use java.util.*; to import all the classes in path.
//You can create your own package and put in external libraries to call imports.

/**
 * The main methos lets the JVM call our code.
 * the variable name args is common because it hints that this list contains values taht wewe read in (arguments) in JVM
 * [] are brackets and represent an array.
 * public and static are required for main(), methods there are some optional modifiers allowed.
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Random r = new Random();
        System.out.println(r.nextInt(10)); // a number 0 - 9
    }
}