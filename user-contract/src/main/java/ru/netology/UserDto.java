package ru.netology;

import lombok.Value;

/**
 * DTO for {@link User}
 */
@Value
public class UserDto {
    String fio;
    String deliveryAddress;
    String phoneNumber;
    String email;
}