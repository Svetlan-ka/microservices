package ru.netology.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import ru.netology.OrderDto;
import ru.netology.UserDto;
import ru.netology.model.UserOrders;

@Service
public class BffService {

    @Value("${user.service.uri}")
    private String userServiceUri;

    @Value("${order.service.uri}")
    private String orderServiceUri;

    public UserOrders getById(int userId) {
        var restClient = RestClient.create();

        UserDto user = restClient.get()
                .uri(userServiceUri + "/api/users/{userId}", userId)
                .retrieve()
                .body(UserDto.class);

        OrderDto order = restClient.get()
                .uri(orderServiceUri + "/api/orders/by-user/{userId}", userId)
                .retrieve()
                .body(OrderDto.class);

        return new UserOrders(user, order);
    }
}
