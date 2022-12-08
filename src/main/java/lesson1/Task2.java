package lesson1;

public class Task2 {
    public static void main(String[] args) {
        numbers();
    }

    private static void numbers() {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
            } else if (arr[i] == 0) {
                count = 0;
            }
        }
        System.out.println("Elements: " + count);
    }
}
