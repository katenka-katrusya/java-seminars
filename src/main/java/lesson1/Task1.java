package lesson1;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        userName();
    }

    private static void userName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
    }
}
