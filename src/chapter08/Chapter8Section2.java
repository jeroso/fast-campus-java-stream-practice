package chapter08;

import chapter08.model.Order;
import chapter08.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Chapter8Section2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, -5, 7, 9);
        boolean allPositive = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println("allPositive = " + allPositive);

        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@example.com");
        System.out.println("user1 = " + user1);

        Order order1 = new Order()
                .setId(1001L)
                .setAmount(BigDecimal.valueOf(2000))
                .setStatus(Order.OrderStatus.CREATED);
        Order order2 = new Order()
                .setId(1002L)
                .setAmount(BigDecimal.valueOf(4000))
                .setStatus(Order.OrderStatus.ERROR);
        Order order3 = new Order()
                .setId(1003L)
                .setAmount(BigDecimal.valueOf(3000))
                .setStatus(Order.OrderStatus.ERROR);
        Order order4 = new Order()
                .setId(1004L)
                .setAmount(BigDecimal.valueOf(7000))
                .setStatus(Order.OrderStatus.PROCESSED);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4);
        boolean orderError = orders.stream()
                .anyMatch(order -> order.getStatus() == Order.OrderStatus.ERROR);

    }
}
