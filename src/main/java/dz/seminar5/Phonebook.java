package dz.seminar5;


import java.util.HashMap;
import java.util.List;

public class Phonebook {
    public static void main(String[] args) {
        telephoneBook("Смирнова");
    }

    private static void telephoneBook(String user) {

        HashMap<String, List<String>> telephoneBook = new HashMap<>();

        telephoneBook.put("Иванов", List.of("32-15-44", "12-12-10", "8-800-555-44-12"));
        telephoneBook.put("Смирнова", List.of("45-34-12", "8-945-890-90-00"));
        telephoneBook.put("Кремов", List.of("8-900-678-09-09"));
        telephoneBook.put("Панамарёв", List.of("8-907-987-88-10", "90-34-40"));
        telephoneBook.put("Жирнов", List.of("33-15-90"));
        telephoneBook.put("Коваленко", List.of("22-11-10", "10-21-78", "8-950-56-70"));

        System.out.println(user + ": " + telephoneBook.get(user));
    }

}
