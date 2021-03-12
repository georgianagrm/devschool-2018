package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        /*
         * Given the following input data.
         */
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("One", "Two", "three", "four", "five", "six", "seven", "Eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen", "sixteen", "Nineteen", "twenty");

        /*
         * Implement ONE method PER exercise given todos:
         */

        /*
         * For each
         */
        // 1: using "numbers" as input, print first ten numbers
//        example(numbers);
            numbers.stream()
                    .limit(10)
                    .forEach(System.out::println);

        // 2: using "numbers" as input print first ten odd numbers
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .limit(10)
                .forEach(System.out::println);

        // 3: using "numbers" as input print first ten even numbers
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .limit(10)
                .forEach(System.out::println);

        // 4: implement 1, 2, 3 using one method
        implement123(numbers, number -> number % 2 == 0, 20);

        /*
         * Sums
         */
        // 5. using "numbers" as input print their sum
        System.out.println(numbers.stream()
                .reduce(0, Integer::sum));

        // 6. using "numbers" as input print the sum of the odd numbers
        System.out.println( numbers.stream()
                .filter(number -> number % 2 == 1)
                .reduce(0, Integer::sum));

        // 7. using "numbers" as input print the sum of the even numbers
        System.out.println( numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(0, Integer::sum));

        // 8. using "numbers" as input print the sum of the even numbers which contain '7'
        System.out.println( numbers.stream()
                .filter(number -> number % 2 == 0)
                .filter(number -> String.valueOf(number).contains("7"))
                .reduce(0, Integer::sum));

        // 9. implement 5, 6, 7, 8 using one method
        implement5678(numbers, number -> number % 2 == 0 && String.valueOf(number).contains("7"));

        /*
         * Mixed map/filter/reduce
         */
        // 10. using "numbers" calculate the sum of the double of even numbers
        System.out.println( numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .reduce(0, Integer::sum));

        // 11. using "numbers" calculate the sum of the triple of odd numbers
        System.out.println( numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * 3)
                .reduce(0, Integer::sum));

        // 12. using "numbers" calculate the sum of their half (1/2)
        System.out.println( numbers.stream()
                .mapToDouble(number -> number / 2d)
                .reduce(0, Double::sum));

        // 13 implement 10, 11, 12 using one method
        implement101112(numbers, number -> number % 2 == 1, number -> number * 3d);

        /*
         * Collectors
         */
        // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
        System.out.println( words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
        );

        // 15. using "words" as input create a List containing all words starting with a vowel
        System.out.println( words.stream()
                .filter(word -> word.startsWith("A")||word.startsWith("E")||word.startsWith("I")||word.startsWith("O")||word.startsWith("U")||word.startsWith("a")||word.startsWith("e")||word.startsWith("i")||word.startsWith("o")||word.startsWith("u"))
                .collect(Collectors.toList())
        );

        // 16. using "words" as input create a List containing all words ending in 'teen'
        System.out.println( words.stream()
                .filter(word -> word.endsWith("teen"))
                .collect(Collectors.toList())
        );

        // 17. implement 11 and 12 using one method (I guess maybe here it should've been 15 and 16?)
        implement1516(words, word -> word.endsWith("teen"));

        // 18. using words as input create a Set of words with an odd number of letters
        System.out.println(words.stream()
                .filter(word -> word.length() % 2 == 0)
                .collect(Collectors.toSet())
        );

        // 19. using words as input create a Set containing the number of letters in a word
        System.out.println( words.stream()
                .filter(word-> word.length() == 4)
                .collect(Collectors.toSet())
        );

        /*
         * Converting to java 8
         */
        // 20. convert the following code to java 8
        nonJava8Method(numbers);
        Java8Method(numbers);

        /*
         * Optional<T>
         */
        // 21. using "numbers" as input print the first odd number that can be divided by 121, if it does not exist print -1
        System.out.println( numbers.stream()
                        .filter(number -> number % 2 == 1)
                        .filter(number -> number % 121 == 0)
                        .findFirst()
                        .orElse(-1)
        );
    }

    private static void example(List<Integer> numbers) {
        numbers.stream()
                .limit(10)
                .forEach(System.out::print);
    }

    private static void implement123(List<Integer> numbers, Predicate<Integer> predicate, Integer limit){
        numbers.stream()
                .limit(limit)
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static void implement5678(List<Integer> numbers, Predicate<Integer> predicate){
        System.out.println( numbers.stream()
                .filter(predicate)
                .reduce(0, Integer::sum));
    }

    private static void implement101112(List<Integer> numbers, Predicate<Integer> predicate, Function<Integer, Double> mapper){
        System.out.println( numbers.stream()
                .filter(predicate)
                .map(mapper)
                .reduce(0d, (result, e) -> result + e));
    }

    private static void implement1516(List<String> words, Predicate<String> predicate){
        System.out.println( words.stream()
                .filter(predicate)
                .collect(Collectors.toList())
        );
    }

    private static void Java8Method(List<Integer> numbers){
        System.out.println(
               numbers.stream()
                       .filter(number -> number < 11)
                       .filter(number -> number % 2 == 0)
                       .map(number -> number + 5)
                       .map(number -> number * 7)
                       .map( number -> {
                           if(number % 20 == 3)
                               number = number/20;
                           return number;
                       })
                       .reduce(0, (result, e) -> result += (e/10))

        );

    }

    private static void nonJava8Method(List<Integer> numbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = 0;

            if (numbers.get(i) % 2 == 0) {
                num = numbers.get(i) + 5;
            } else {
                sum += 0;
                continue;
            }

            num = num * 7;
            if (num % 20 == 3) {
                num = num / 20;
            }

            sum += (num / 10);

            if (++counter > 5) {
                break;
            }
        }

        System.out.println(sum);
    }
}
