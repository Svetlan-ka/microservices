package ru.netology;

import lombok.Value;

import java.util.List;

/**
 * DTO for {@link Order}
 */
@Value
public class OrderDto {
    double orderAmount;
    String orderCurrency;
    List<OrderItems> orderItems;
}