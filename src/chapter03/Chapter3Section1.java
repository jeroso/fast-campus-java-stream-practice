package chapter03;

import java.util.function.Function;
import chapter03.util.Adder;

public class
Chapter3Section1 {
    public static void main(String[] args) {
        Function<Integer, Integer> myAdder = new Adder();
        int result = myAdder.apply(5);
        System.out.println("result = " + result);
    }
}

