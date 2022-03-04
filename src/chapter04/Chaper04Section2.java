package chapter04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chaper04Section2 {
    public static void main(String[] args) {
        Consumer<String> myStringConsumer = (String str) ->
                System.out.println(str);
//        myStringConsumer.accept("hello");
//        myStringConsumer.accept("world");

        List<Integer> integeInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerProcessor = x ->
                System.out.println("Processing integer = " + x);
        process(integeInputs, myIntegerProcessor);
    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}
