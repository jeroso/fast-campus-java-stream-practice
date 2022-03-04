package chapter04;

import java.util.function.Supplier;

public class Chapter04Section1 {
    public static void main(String[] args) {
        Supplier<String> myStringSuppier = () -> "Hello World";
//        System.out.println(myStringSuppier.get());
        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        printRandomDoubles(myRandomDoubleSupplier, 5);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
