package chapter08;

import java.util.Arrays;
import java.util.List;

public class Chapter8Section4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, -2, -5, 3);
        int sum = numbers.stream()
                .reduce((x, y) -> x + y)
                .get();
        System.out.println("sum = " + sum);
    }

}
