package dz.seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Catalog {

    public static void laptopsCatalog() {
        Laptop lp1 = new Laptop(4, 256, 15.6f, "AMD", "IPS", "black");
        Laptop lp2 = new Laptop(4, 128, 15.6f, "Intel", "TN", "black");
        Laptop lp3 = new Laptop(8, 256, 15.6f, "AMD", "IPS", "grey");
        Laptop lp4 = new Laptop(16, 512, 17.3f, "Intel", "IPS", "silver");
        Laptop lp5 = new Laptop(32, 512, 14f, "Intel", "IPS", "black");
        Laptop lp6 = new Laptop(16, 1024, 16.2f, "Apple", "mini-LED", "grey");
        Laptop lp7 = new Laptop(32, 1024, 17.3f, "AMD", "IPS", "silver");
        Laptop lp8 = new Laptop(8, 512, 15.6f, "Intel", "IPS", "black");

        HashSet<Laptop> laptops = new HashSet<>(Arrays.asList(lp1, lp2, lp3, lp4, lp5, lp6, lp7, lp8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите номер критерия, по которму будем искать ноутбук:\n" +
                " 1. Оперативная память\n 2. SSD\n 3. Диагональ экрана\n 4. Процессор\n " +
                "5. Тип экрана\n 6. Цвет\n 7. Посмотреть всё");
        System.out.print("Ввод: ");
        int criterion = scanner.nextInt();

        boolean flag = false;

        switch (criterion) {
            case 1:
                System.out.print("Укажите минимальную оперативную память: ");
                int minRam = scanner.nextInt();
                for (Laptop elem : laptops) {
                    if (elem.getRam() >= minRam) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 2:
                System.out.print("Укажите минимальный объём жёсткого диска: ");
                int minSsd = scanner.nextInt();
                for (Laptop elem : laptops) {
                    if (elem.getSsd() >= minSsd) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 3:
                System.out.print("Укажите минимальный размер диагонали: ");
                float minDiagonal = scanner.nextFloat();
                for (Laptop elem : laptops) {
                    if (elem.getDiagonal() >= minDiagonal) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 4:
                System.out.print("Укажите какой процессор вас интересует (AMD, Intel, Apple): ");
                String processor = scanner.next();
                for (Laptop elem : laptops) {
                    if (elem.getCpu().equals(processor)) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 5:
                System.out.print("Укажите какой тип экрана вас интересует (IPS, TN): ");
                String screen = scanner.next();
                for (Laptop elem : laptops) {
                    if (elem.getScreenType().equals(screen)) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 6:
                System.out.print("Укажите какой цвет вас интересует (black, silver, grey): ");
                String col = scanner.next();
                for (Laptop elem : laptops) {
                    if (elem.getColor().equals(col)) {
                        System.out.println(elem);
                        flag = true;
                    }
                }
                break;
            case 7:
                for (Laptop i : laptops) {
                    System.out.println(i);
                    flag = true;
                }
                break;
            default:
                throw new IllegalStateException("Неправильное значение, только пункты меню!" + criterion);
        }

        if (!flag) {
            System.out.println("\nТаких ноутбуков у нас нет! Попробуйте ещё раз!");
            laptopsCatalog();
        }
    }
}
