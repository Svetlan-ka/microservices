package ru.netology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.OrderDto;
import ru.netology.repository.OrderRepository;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Optional<OrderDto> getById(int userId) {
        return repository.getById(userId)
                .map(order -> new OrderDto(order.getOrderAmount(),
                        order.getOrderCurrency(),
                        order.getOrderItems()));
    }
}