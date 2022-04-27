package chapter03;

import chapter03.util.Adder;

import java.util.function.Function;

//Function interface <T, R> : T 입력값 , V 리턴값
public class Chapter3Section2 {
    public static void main(String[] args) {
//        Function<Integer, Integer> myAdder = new Adder();
//        int result = myAdder.apply(5);
//        System.out.println(result);

        Function<Integer, Integer> myAdder = x ->  x + 10;
        int result = myAdder.apply(5);

    }
}
