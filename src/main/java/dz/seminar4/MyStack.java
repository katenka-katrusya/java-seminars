package dz.seminar4;

import java.util.Collections;
import java.util.LinkedList;

public class MyStack {
    private static LinkedList<String> arrayStack = new LinkedList<>();

    public static void main(String[] args) {

        Collections.addAll(arrayStack, "house", "friend", "cafe", "car", "computer");

        System.out.println("Элементы стека: " + arrayStack);
        push("hello"); //добавить в конец
        System.out.println("Последний элемент в стеке: " + peek()); //посмотреть последнее в стеке
        System.out.println("Извлечённый последний элемент в стеке: " + pop()); //удалить и извлечь последнее в стеке
    }

    private static void push(String str) {
        arrayStack.push(str);
        System.out.println("Элемент добавлен в конец стека: " + arrayStack);
    }

    private static String peek() {
        return arrayStack.peek();
    }

    private static String pop() {
        return arrayStack.pop();
    }
}
