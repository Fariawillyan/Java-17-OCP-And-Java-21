package java17.Chapter_4_Core_APISs;

import java.util.Arrays;

public class ArraysExamples {


    public static void main(String[] args) {


        String[] strings = {"10", "9", "100"};

        Arrays.sort(strings); //This case, string sort in alphabetic order.

        for(String s : strings){
            System.out.println(s + " ");
        }

        System.out.println("--------------");
        System.out.println(strings.length);
        System.out.println(strings[2]);

        System.out.println("--------------");

        System.out.println(Arrays.equals(new String[] {"a"}, new String[] {"A"} ));
        //compare 2  arrays to determine are equals.

        System.out.println(Arrays.compare(new String[] {"a"}, new String[] {"A"} ));
        //compare 2  arrays to determine which is "smaller"

        System.out.println(Arrays.mismatch(new String[] {"A"}, new String[] {"A"} ));
        //if arrays are equals, mismatch return -1


        /***********************************************************************************
         * Methods          When arrays contain same data        When arrays are different *
         ***********************************************************************************
         *  equals                        true                         false               *
         *  compare                        0                        positive or negative   *
         *  mismatch                      -1                        Zero or positive index *
         ***********************************************************************************
         */


    }
}
