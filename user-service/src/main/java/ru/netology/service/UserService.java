package ru.netology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.UserDto;
import ru.netology.repository.UserRepository;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Optional<UserDto> getUserById(int id) {
        return repository.getUserById(id)
                .map(user -> new UserDto(
                        user.getFio(),
                        user.getDeliveryAddress(),
                        user.getPhoneNumber(),
                        user.getEmail()
                ));
    }
}
