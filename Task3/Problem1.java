package Task3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Текст анализатор");
        System.out.println("Введите строку для анализа (или 'выход' для завершения):");

        while (true) {
            try {
                System.out.print("> ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("выход")) {
                    System.out.println("Программа завершена.");
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Ошибка: Введена пустая строка. Попробуйте снова.");
                    continue;
                }

                analyzeText(input);

            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка. Пожалуйста, попробуйте снова.");
            }
        }

        scanner.close();
    }

    private static void analyzeText(String text) {
        int totalLetters = 0;
        int vowels = 0;
        int consonants = 0;
        int punctuationMarks = 0;
        int spaces = 0;
        int wordCount = 0;


        char[] vowelChars = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};
        char[] consonantChars = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'};
        char[] punctuationChars = {'.', ',', '!', '?', ':', ';', '-', '(', ')', '[', ']', '{', '}', '"', '\''};


        String[] words = text.split("\\s+");
        wordCount = words.length;
        if (wordCount > 0 && words[0].isEmpty()) {
            wordCount--;
        }

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                totalLetters++;


                boolean isVowel = false;
                for (char v : vowelChars) {
                    if (c == v) {
                        vowels++;
                        isVowel = true;
                        break;
                    }
                }


                if (!isVowel) {
                    for (char cons : consonantChars) {
                        if (c == cons) {
                            consonants++;
                            break;
                        }
                    }
                }
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {

                boolean isPunctuation = false;
                for (char p : punctuationChars) {
                    if (c == p) {
                        punctuationMarks++;
                        isPunctuation = true;
                        break;
                    }
                }
            }
        }


        System.out.println("\nРезультаты анализа:");
        System.out.println("Общее количество слов: " + wordCount);
        System.out.println("Общее количество букв: " + totalLetters);
        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);
        System.out.println("Количество знаков препинания: " + punctuationMarks);
        System.out.println("Количество пробелов: " + spaces);
        System.out.println();
    }
}
