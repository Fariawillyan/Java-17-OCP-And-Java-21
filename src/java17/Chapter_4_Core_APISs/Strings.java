package java17.Chapter_4_Core_APISs;

/**
 *
 * Any example methods in Strings
 *
 */

public class Strings {


    public static void main(String[] args) {

        String example = "Hello world";


        System.out.println(example.length()); //return numbers of characteres in the string.
        System.out.println(example.charAt(5));// return characteres is a specific position.
        System.out.println(example.indent('e')); //add same numbers of blank spaces
        System.out.println(example.substring(3)); // find and return parts of the string.
        System.out.println(example.substring(example.indexOf('w'))); //find and return index/
        System.out.println(example.toUpperCase());// or lowercase // convert strings.

        //boolen
        System.out.println(example.equals("Hello world")); // checks objets contain same order
        System.out.println(example.equalsIgnoreCase("hello world")); // ignore uppercase or lowercase
        System.out.println(example.startsWith("a")); //is contained and start letter ?
        System.out.println(example.isBlank()); // is blank ?
        System.out.println(example.isEmpty()); // is empty?

        //others
        System.out.println(example.replace('H', 'R')); //replace values
        System.out.println(example.trim()); // remove space
        System.out.println(example.strip()); // remove space and support unicode

        //example
        String exampleTwo = "Hello world atomic       ".trim().toLowerCase().replace('H', 'a');
        System.out.println(exampleTwo);

    }


}
