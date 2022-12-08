package lesson1;


import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        array();
    }

    private static void array() {
        Random random = new Random();
        int[] array = new int[20];
        final int VAL = 3;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,6);
        }

        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[right] == VAL) {
                right--;
            } else if (array[left] == VAL) {
                array[left] = array[right];
                array[right] = VAL;

                right--;
                left++;
            } else if (array[left] != VAL) {
                left++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
