package ru.netology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.OrderDto;
import ru.netology.service.OrderService;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders/")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/by-user/{userId}")
    public Optional<OrderDto> getOrderByUserId(@PathVariable int userId) {
        return service.getById(userId);
    }
}