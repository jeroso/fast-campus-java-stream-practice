package chapter05;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter5Section1 {
    public static int calculate(int x, int y, BiFunction<Integer, Integer, Integer> operator) {
        return operator.apply(x, y);
    }

    //static  메서드
    public static int multiply(int x, int y) {
        return x * y;
    }

    //instance 메서드
    public int substract(int x, int y) {
        return x - y;
    }

    //메서드에서 메서드 호출 방법
    public void myMethod(){
        System.out.println(calculate(8, 2, this::substract));
    }

    public static void main(String[] args) {

//        int a = Integer.parseInt("15");
        Function<String, Integer> str2int = Integer::parseInt;
//        System.out.println(str2int.apply("20"));

        String str = "Hello";
        Predicate<String> equalsToHello = str::equals;
//        System.out.println(equalsToHello.test("Hello"));

//        System.out.println(calculate(8, 2, (x, y)-> x + y));
        
        //static 메서드 호출
        System.out.println(calculate(8, 2, Chapter5Section1::multiply));
        
        //instance 메서드 호출
        Chapter5Section1 instance = new Chapter5Section1();
        System.out.println(calculate(8, 2, instance::substract));

        //메서드에서 메서드 호출
        instance.myMethod();
    }
}
