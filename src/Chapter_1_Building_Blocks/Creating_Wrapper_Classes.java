package Chapter_1_Building_Blocks;


/**
 * Each pritive type has a wrapper class, which is an object type that corresponds to the primitive.
 *
 */

public class Creating_Wrapper_Classes {


    //list all the  wra[[er classes along with how to create them/

    //primitive_type      Wrapper-Class         Wr..-inherits-Number     Example-of-creating
    /************************************************************************************************
     * boolean              Boolean             NO                       Boolean.valueOf(true)      *
     * byte                 Byte                YES                      Byte.valueOf((byte) 1)     *
     * short                Short               YES                      Short.valueOf((short) 1)   *
     * int                  Integer             YES                      Integer.valueOf(1)         *
     * long                 Long                YES                      Long.valueOf(1)            *
     * float                Float               YES                      Float.valueOf((float) 1.0) *
     * double               Double              YES                      Double.valueOf(1.0)        *
     * char                 Character           NO                       Character.valueOf('c')     *
     ***********************************************************************************************/

    //there is also calueOf() variant that converts a String  into the wrapper class. For example.

    int primitive = Integer.parseInt("123"); //Converts a String to an int primitive
    Integer wrapper = Integer.valueOf("123");// Converts a String to an Integer wrapper class.

    /* Some wrapper classes contain additional helper methods for working with numbers.

    max (int num1, int num2), which returns the largest of the two numbers.
    min (int num1, int num2), which returns the smallest of the two numbers.
    sum (int num1, int num2), which adds the two numbers.

    */


    /* any examples

    Also note that primitive types cannot be used in Collections, only objects.
    Therefore, the solution is to use Wrappers.

    "Non-primitive" types allocate space on the heap and put pressure on the garbage collector.

    Primitives allocate on the stack and management is simple and fast. They even waste a lot of memory because of
    the natural overhead that objects have. Again this has changed a bit in some cases.

    Primitive types will not have NullPointerException issues.

    In the specific case of Java, the syntax of primitive types is more convenient than non-primitive types.
     Primitive types don't need to use equals(), for example, but that may be changing, at least in part.

    */



}
