package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        passport();
        System.out.println(romanNumerals("MCMXXIX"));
    }




    //    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//        Вывести данные по сотрудникам с фамилией Иванов
    private static void passport() {
        String userName = "Иванов";
        Map<String, String> passports = new HashMap<>();
        passports.put("12345", "Иванов");
        passports.put("321456 ", "Васильев");
        passports.put("43535", "Иванов");
        passports.put("345277", "Васильев");
        passports.put("567445", "Иванов");
        passports.put("876845", "Петрова");

//        for (String key : passports.keySet()) {
//            if (passports.get(key).equals(userName)) {
//                System.out.printf("%s - %s%n", key, passports.get(key));
//            }
//        }

        for (Map.Entry<String, String> entry : passports.entrySet()) {
            if (entry.getValue().equals(userName)) {
                System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
            }
        }
    }


    private static Integer romanNumerals(String romanNum) {
        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int lastIndex = romanNum.length() - 1;
        char lastRomanChar = romanNum.charAt(lastIndex);
        int decimalNum = romanToDecimalMap.get(lastRomanChar);
        int prevNum = decimalNum;

        for (int i = 0; i < lastIndex; i++) {
            int currentIndex = lastIndex - 1 - i;
            char currentRomanChar = romanNum.charAt(currentIndex);
            int currentNum = romanToDecimalMap.get(currentRomanChar);

//            int prevIndex = currentIndex + 1;
//            char prevRomanChar = romanNum.charAt(prevIndex);
//            int prevNum = romanToDecimalMap.get(prevRomanChar);

            if (currentNum < prevNum) {
                currentNum *= -1;
            }

            prevNum = currentNum;
            decimalNum += currentNum;
        }

        return decimalNum;

    }
}