package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.Order;
import ru.netology.OrderItems;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class OrderRepository {

    private final Map<Integer, Order> orders = Map.of(5, new Order(1, 5, 3490, "руб.",
                    List.of(new OrderItems("Наушники", 1, 3000),
                            new OrderItems("Зарядка", 1, 490))),
            1, new Order(2, 1, 2300, "руб.",
                    List.of(new OrderItems("Часы", 1, 1500),
                            new OrderItems("Ремешок на часы", 2, 500),
                            new OrderItems("Чехол на телефон", 1, 300))),
            4, new Order(3, 4, 49690, "руб.",
                    List.of(new OrderItems("Телефон", 1, 49690)))
    );

    public Optional<Order> getById(int userId) {
        return Optional.ofNullable(orders.get(userId));
    }
}
