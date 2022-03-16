package chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Chapter4Section4 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        List<Integer> input = Arrays.asList(10, -5, 4, -2, 0);
        System.out.println("Positive number " + filter(input, isPositive));
        System.out.println("Non-Positive number " + filter(input, isPositive.negate()));
        System.out.println("Non-Positive number " + filter(input, isPositive.or(x-> x == 0)));
        System.out.println("Positive Even number " + filter(input, isPositive.and(x-> x % 2 == 0)));


    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> condition) {
        List<T> output = new ArrayList<>();
        for (T input : inputs) {
            if (condition.test(input)) {
                output.add(input);
            }
        }
        return output;
    }
}
