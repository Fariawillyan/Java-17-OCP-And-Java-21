package java17.Chapter_1_Building_Blocks;


/**
 * @author Willyan faria
 *
 * types primitive is just a single value in memory. is not an objet in java.
 */


public class Data_Types_Primitives {

    // Types primitive begin with lowercase.
    // Reference types begin with Uppercase.


    boolean x; //true or false

    //decimal
    byte a; //8 bit    123
    short b; //16 bit  123
    int c;// 32 bit   123
    long d; // 64 bit  123L

    //
    float f;// 32 bit  123.45f
    double g;// 64 bit 123.456
    char h;// 16 bit

    String i;// is a object and not type primitive.
    // long max = 321654897; // does not compile
    // long max = 321654987L; // now java it is a long
    // int million = 1000000;
    //int million = 1_000_000; // You can use underscore to make them easier to read;

    /**
    * Primitives do not have methods declared on them.
    * */

    //int value = null; DOES NOT COMPILE
    // You can use Integer to wrapper class, instead of int.

   // String name = null;


}
