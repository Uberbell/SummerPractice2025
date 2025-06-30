package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Анализатор списков чисел");
        System.out.println("Введите числа через пробел");

        List<Double> list1 = readList(scanner, "первый");
        List<Double> list2 = readList(scanner, "второй");

        analyzeList(list1, 1);
        analyzeList(list2, 2);

        Set<Double> union = new TreeSet<>(list1);
        union.addAll(list2);
        System.out.println("\nОбъединенный список без дубликатов: " + union);

        scanner.close();
    }

    private static List<Double> readList(Scanner scanner, String listName) {
        while (true) {
            try {
                System.out.print("Введите " + listName + " список чисел: ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Ошибка: Пустой ввод. Пожалуйста, введите числа.");
                    continue;
                }

                String[] parts = input.split("\\s+");
                List<Double> numbers = new ArrayList<>();

                for (String part : parts) {
                    try {

                        String cleaned = part.replace(',', '.');
                        numbers.add(Double.parseDouble(cleaned));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: '" + part + "' не является числом. Попробуйте снова.");
                        throw e;
                    }
                }

                return numbers;

            } catch (NumberFormatException e) {

            } catch (Exception e) {
                System.out.println("Неизвестная ошибка. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void analyzeList(List<Double> list, int listNumber) {
        System.out.println("\nРезультаты анализа списка " + listNumber + ":");

        if (list.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }


        double max = Collections.max(list);
        System.out.println("Максимальное число: " + max);


        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        double average = sum / list.size();
        System.out.printf("Среднее арифметическое: %.2f%n", average);

        //
        List<Double> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        System.out.println("Отсортированный список: " + sorted);


        Set<Double> unique = new TreeSet<>(list);
        System.out.println("Уникальные элементы: " + unique);
    }
}