package lesson3;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {
//        listNum();
//        solarSystemPlanets();
//        solarSystemPlanets2();
        solarSystemPlanets3();
    }

    private static void solarSystemPlanets3() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");

        Map<String, Integer> frequencyByPlanet = new HashMap<>();
        for (String planet : planets) {
            Integer frequency = frequencyByPlanet.getOrDefault(planet, 0);
            // Верхняя строчка то же самое, что и это:
            // if (frequency == null) {
            //    frequency = 0; }

            frequencyByPlanet.put(planet, ++frequency);
        }

        frequencyByPlanet.forEach((planet, frequency) -> System.out.printf("%s\t-\t%s раз%n", planet, frequency));
    }

    private static void solarSystemPlanets2() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");

        planets.stream().distinct().
                forEach(planet -> System.out.printf("%s\t-\t%s раз%n", planet,
                        planets.stream().filter(planet::equals).count()));
    }


    //    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке
    private static void solarSystemPlanets() {
        ArrayList<String> planets = new ArrayList<>();
        Collections.addAll(planets,"Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
                "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        System.out.println(planets);

        List<String> distinctPlanets = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            if (!distinctPlanets.contains(planet)) {
                int count = 1;
                distinctPlanets.add(planet);
                for (int j = i + 1; j < planets.size(); j++) {
                    if (planet.equals(planets.get(j))) {
                        count++;
                    }
                }
                System.out.printf("%s\t-\t%s раз%n", planet, count);
            }
            
        }
    }


    // Заполните список десятью случайными числами. Отсортируйте список методом sort() и выведите его на экран
    private static void listNum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        list.sort(Comparator.naturalOrder());
//        Collections.sort(list);              // то же самое, что и сверху
//        list.sort(Integer::compare);         //  Сравнение двух значений
        System.out.println(list);
    }
}


