package dz.seminar4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        reverse();
    }

    private static void reverse() {
        Random random = new Random();
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            ll.add(random.nextInt(50));
        }
        System.out.println("Изначальный список: " + ll);

        Collections.reverse(ll);

        System.out.println("Обратный список: " + ll);
    }
}
