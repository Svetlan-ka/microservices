package ru.netology;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {
    private int id;
    private int userId;
    private double orderAmount; //сумма заказа
    private String orderCurrency; //валюта заказа
    private List<OrderItems> orderItems; //список товаров в заказе
}
