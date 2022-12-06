package Chapter_1_Building_Blocks;

/**
 * A variable is name for a piece of memory that stores data. *
 */

public class Declaring_Variables {


    String zooName = "The Best Zoo";
    int ola, oi, teste = 3; // multiple variable
    final int y = 10; //final is equivalent to declaring constants in the other languages.

    //ps: if variable is declared but never used, so it is not required to be initialized.


                                    //Reserved words
    /******************************************************************************************
     * abstract            assert             boolean            break              byte      *
     * case                catch              char               class              const*    *
     * continue            default            do                 double             else      *
     * for                 goto*              if                 implements         float     *
     * enum                extends            final              finally            while     *
     * instanceof          int                interface          long               import    *
     * new                 package            private            protected          native    *
     * return              short              static             strictfp           public    *
     * switch              synchronized        this               throw              super     *
     * transient           try                void               volatile           throws    *
     *****************************************************************************************/

    // Java use uppercase snake case to CONSTANTS and ENUM values. EXAMPLE_JAVA_HERE


    // var tricky = "hello" // DOES NOT COMPILE ... type inference
    public void whatTypeAmI(){
        var name = "hello"; // type local variable
        var size = 7;

        //var = compiler to determine the type for you

    }


}
