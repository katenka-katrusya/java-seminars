package dz.seminar2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        System.out.println(palindrome("level"));
        saveFile(repeat("TEXT", 100));
    }

//    1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//    (возвращает boolean значение).
    private static boolean palindrome(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        boolean res = result.equals(str);
        return res;
    }


//    2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.
    private static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str + " ");
        }
        return String.valueOf(sb);
    }

    private static void saveFile(String text) {
        try (FileWriter fw = new FileWriter("src/main/resources/task2.txt", false)) {
            fw.write(text);
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
