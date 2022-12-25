package lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        example();
        arrayEx();
    }

    private static void example() {
        List<Integer> data = List.of(1, 2, 3, 2, 4, 5, 6, 3);
        List<String> data1 = List.of("Яблоко", "Апельсин", "Груша", "Киви", "Арбуз");

        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));

        System.out.println(new HashSet<>(data1));
        System.out.println(new LinkedHashSet<>(data1));
        System.out.println(new TreeSet<>(data1));
    }


    // Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 24. Создайте метод, в который
    // передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массивеи и
    // верните его в виде числа с плавающей запятой. Для вычисления процента используйте формулу:
    // % уникальных чисел = кол-во уник. чисел * 100/общее кол-во чисел в массиве.
    private static void arrayEx() {
        Integer[] list = new Integer[105];
        Random random = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(1, 101);
        }

        HashSet<Integer> uniq = new HashSet<>(Arrays.asList(list));

        System.out.printf("%.2f%n", (double) uniq.size() * 100 / list.length);
    }
}
