package dz.seminar4;

import java.util.Collections;
import java.util.LinkedList;

public class MyStack {
    private static LinkedList<String> arrayStack = new LinkedList<>();

    public static void main(String[] args) {

        Collections.addAll(arrayStack, "house", "friend", "cafe", "car", "computer");

        push("hello", arrayStack); //добавить в конец
        System.out.println(peek(arrayStack)); //посмотреть последнее в стеке
        System.out.println(pop(arrayStack)); //удалить и извлечь последнее в стеке
    }

    private static void push(String str, LinkedList<String> list) {
        list.push(str);
    }

    private static String peek(LinkedList<String> list) {
        return list.peek();
    }

    private static String pop(LinkedList<String> list) {
        return list.pop();
    }
}
