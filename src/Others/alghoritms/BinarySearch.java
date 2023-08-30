package Others.alghoritms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(binarySeach(ints, 9));

        // OR

        /** YOU CAN RESOLVE WITH METHODS ARRAYS BINARYSEARCH**/
        System.out.println(Arrays.binarySearch(ints, 9));
    }


    public static int binarySeach(int[] numbers, int numberToFind) {

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            }

            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;

            }

        }

        return -1;
    }


}
