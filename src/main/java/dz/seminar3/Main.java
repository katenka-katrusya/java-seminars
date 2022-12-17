package dz.seminar3;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        listIntNums(10);
        minMaxAverage(10);
    }




    //   1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
    private static void listIntNums(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(50));
        }

        System.out.println("Изначальный список: " + list);

        list.removeIf(x -> x % 2 == 0);
        System.out.println("Список без чётных чисел: " + list);
    }


//    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
    private static void minMaxAverage(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(50));
        }

        System.out.println("Изначальный список: " + list);

        Optional<Integer> min = list.stream().min(Integer::compare);
        Optional<Integer> max = list.stream().max(Integer::compare);
        double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("Минимальное значение: " + min.get());
        System.out.println("Максимальное значение: " + max.get());
        System.out.println("Среднее арифметическое: " + average);

    }

}



