package Chapter_4_Core_APISs;


/**
 * StringBuilder class creates or manipulat a String without storing interim String values.
 * Is not immutable.
 * You can inserting Data, Deleting Contents, Replacing Portions, Reversing and others.
 * the append() method is by far the most frequently used method in stringBuilder
 *
 * Stores characters specified by its capacity, if it is exceeded, it is increased to accommodate the additional characters;
 * You don't need to allocate new objects when you perform a concatenation;
 * They are not synchronized;
 * They are not thread safe;
 */

public class StringBuilderExample {

    public static void main(String[] args) {

        /** EXEMPLE
         *  WITHOUT STRINGBUILDER...
         */

        String alpha = "";

        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            System.out.println(alpha);
        }

        System.out.println("----------------------------------------------");


        /** EXEMPLE
         *  WITH STRINGBUILDER...
         */

        StringBuilder alphaa = new StringBuilder();

        for(char current = 'a'; current <= 'z'; current++){
            alphaa.append(current);
            System.out.println(alphaa);
        }
        System.out.println("----------------------------------------------");


        /** EASY EXEMPLE
         *  WITH STRINGBUILDER...
         */

        StringBuilder a = new StringBuilder("abc");

        StringBuilder b = a.append("de");

        b = b.append("f").append("g");

        System.out.println("a=" + a);
        System.out.println("b=" + b);





    }


}
