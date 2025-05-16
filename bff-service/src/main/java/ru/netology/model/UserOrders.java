package ru.netology.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.netology.OrderDto;
import ru.netology.UserDto;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserOrders {
    private UserDto user;
    private OrderDto order;

}
