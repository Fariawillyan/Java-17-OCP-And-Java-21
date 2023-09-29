package java17.Chapter_1_Building_Blocks;

public class Defining_Text_Blocks {

// String block = """ doe """; DOES NOT COMPILE

/**
 * The text block requite a line break after tje opening """;
  */

static String block = """
        doe
        deer""";

//use "\" tells java not to add a new line before deer.

    public static void main(String[] args) {
        System.out.println(block);
    }

}
