package dz.seminar1;


import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {

//        System.out.println(total(0,5));
//        positiveNumber(-10);
//        System.out.println(booleanNum(-7));
//        printLines("Hello kitty", 5);
//        leapYear(2025);
//        replacement();
//        intArray();
//        multiplication();
//        matrix();
//        array(5,3);
        arrayTwo();

    }



    //    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
//    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean total(int a, int b) {
        boolean result;
        int sum = a + b;

        result = sum >= 10 && sum <= 20;
        return result;
    }

    //    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    private static void positiveNumber(int num) {
        String result = num >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(result);
    }

    //    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
//    отрицательное, и вернуть false если положительное.
    private static boolean booleanNum(int num) {
        boolean result = num < 0;
        return result;
    }

    //    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
//    указанную строку, указанное количество раз;
    private static void printLines(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

//    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

//    6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void replacement() {
        byte[] array = new byte[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) random.nextInt(2);
        }

        System.out.println("Изначальный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) ((array[i] == 0) ? 1 : 0);
//            if (array[i] == 0) {
//                array[i] = 1;
//            } else {
//                array[i] = 0;
//            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

//    7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    private static void intArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

//    8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    private static void multiplication() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

//    9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n]
    private static void matrix() {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
//    длиной len, каждая ячейка которого равна initialValue
    private static void array(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

//    11. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void arrayTwo() {
        int[] arr = new int[15];
        int min = arr[0];
        int max = arr[0];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное число: " + min + "\n" + "Максимальное число: " + max);


    }
}