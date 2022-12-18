package dz.seminar4;

import java.util.Collections;
import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<String> arrayQueue = new LinkedList<>();

    public static void main(String[] args) {

        Collections.addAll(arrayQueue, "house", "friend", "cafe", "car", "computer");

        System.out.println("Элементы списка: " + arrayQueue);
        add("hello"); //добавить в конец
        System.out.println("Первый элемент в очереди: " + top()); //посмотреть первое в очереди
        System.out.println("Извлечённый первый элемент в очереди: " + remove()); //извлечь и вернуть первое в очереди
    }

    private static void add(String str) {
        arrayQueue.add(str);
        System.out.println("Элемент добавлен в конец очереди: " + arrayQueue);
    }

    private static String top() {
        return arrayQueue.peek();
    }

    private static String remove() {
        return arrayQueue.remove();
    }
}
